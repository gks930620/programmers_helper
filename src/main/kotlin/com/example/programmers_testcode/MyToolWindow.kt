package com.example.programmers_testcode

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.JBSplitter
import com.intellij.ui.components.JBList
import com.intellij.ui.components.JBPanel
import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.components.JBTextArea
import com.intellij.ui.components.JBTextField
import com.intellij.ui.content.ContentFactory
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.Font
import java.awt.GridLayout
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import javax.swing.BorderFactory
import javax.swing.DefaultListModel
import javax.swing.JButton
import javax.swing.JComboBox
import javax.swing.JPanel
import javax.swing.ListSelectionModel
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener
import javax.swing.event.ListSelectionEvent

class MyToolWindowFactory : ToolWindowFactory {
    override fun shouldBeAvailable(project: Project) = true

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val content = ContentFactory.getInstance()
            .createContent(MyToolWindow(project).getContent(), null, false)
        toolWindow.contentManager.addContent(content)
    }
}

class MyToolWindow(private val project: Project) {

    private val allProblems = ProblemRepository.getAllProblems()
    private var selectedProblem: Problem? = null

    // 검색 · 필터 상태
    private var searchText = ""
    private var selectedLanguage = "전체"

    // UI 컴포넌트
    private val searchField = JBTextField().apply { emptyText.text = "문제 검색..." }

    private val languages = listOf("전체", "Java", "JavaScript", "Kotlin", "Python")
    private val languageCombo = JComboBox(languages.toTypedArray())

    private val codeArea = JBTextArea().apply {
        isEditable = false
        font = Font("Monospaced", Font.PLAIN, 13)
    }
    private val codeBorder = BorderFactory.createTitledBorder("파일 미리보기")

    private val listModel = DefaultListModel<String>()
    private val problemList = JBList(listModel).apply {
        selectionMode = ListSelectionModel.SINGLE_SELECTION
    }

    // 현재 목록에 보이는 문제들 (필터 적용 후)
    private val visibleProblems = mutableListOf<Problem>()

    fun getContent(): JBPanel<JBPanel<*>> {
        val mainPanel = JBPanel<JBPanel<*>>(BorderLayout())

        // ── 상단: 검색창 + 언어 필터 ─────────────────────────
        val topPanel = JPanel(GridLayout(2, 1, 0, 4)).apply {
            border = BorderFactory.createEmptyBorder(4, 4, 4, 4)

            // 검색창
            add(searchField)

            // 언어 필터 콤보박스
            add(languageCombo)
        }

        // 검색어 변경 리스너
        searchField.document.addDocumentListener(object : DocumentListener {
            override fun insertUpdate(e: DocumentEvent) = onFilterChanged()
            override fun removeUpdate(e: DocumentEvent) = onFilterChanged()
            override fun changedUpdate(e: DocumentEvent) = onFilterChanged()
        })

        // 언어 필터 변경 리스너
        languageCombo.addActionListener {
            selectedLanguage = languageCombo.selectedItem as String
            onFilterChanged()
        }

        // ── 왼쪽: 문제 목록 ──────────────────────────────────
        applyFilter() // 초기 목록 로드

        problemList.addListSelectionListener { e: ListSelectionEvent ->
            if (!e.valueIsAdjusting && problemList.selectedIndex >= 0) {
                selectedProblem = visibleProblems.getOrNull(problemList.selectedIndex)
                updatePreview()
            }
        }

        val leftPanel = JBPanel<JBPanel<*>>(BorderLayout()).apply {
            add(topPanel, BorderLayout.NORTH)
            add(JBScrollPane(problemList), BorderLayout.CENTER)
            preferredSize = Dimension(210, 0)
        }

        // ── 오른쪽: 코드 미리보기 + 버튼 ───────────────────
        val previewScroll = JBScrollPane(codeArea).apply { border = codeBorder }

        val createFileBtn = JButton("📄 내 프로젝트에 파일 생성").apply {
            toolTipText = "폴더를 선택하면 해당 파일을 생성하고 에디터에서 엽니다."
            addActionListener { createFile() }
        }
        val copyBtn = JButton("📋 클립보드 복사").apply {
            addActionListener { copyToClipboard() }
        }

        val btnPanel = JPanel(BorderLayout()).apply {
            add(copyBtn, BorderLayout.WEST)
            add(createFileBtn, BorderLayout.EAST)
        }

        val rightPanel = JBPanel<JBPanel<*>>(BorderLayout()).apply {
            add(previewScroll, BorderLayout.CENTER)
            add(btnPanel, BorderLayout.SOUTH)
        }

        // ── 좌우 분할 ────────────────────────────────────────
        val splitter = JBSplitter(false, 0.30f).apply {
            firstComponent = leftPanel
            secondComponent = rightPanel
        }

        mainPanel.add(splitter, BorderLayout.CENTER)
        return mainPanel
    }

    // ── 필터 적용 ─────────────────────────────────────────────
    private fun onFilterChanged() {
        searchText = searchField.text.trim()
        selectedLanguage = languageCombo.selectedItem as String
        val prevSelected = selectedProblem
        applyFilter()
        // 이전 선택 항목 유지
        val idx = visibleProblems.indexOf(prevSelected)
        if (idx >= 0) problemList.selectedIndex = idx
    }

    private fun applyFilter() {
        visibleProblems.clear()
        listModel.clear()

        allProblems
            .filter { p ->
                (selectedLanguage == "전체" || p.language == selectedLanguage) &&
                (searchText.isEmpty() || p.title.contains(searchText, ignoreCase = true))
            }
            .forEach { p ->
                visibleProblems.add(p)
                listModel.addElement("[${p.language}] ${p.title}")
            }
    }

    // ── 미리보기 업데이트 ─────────────────────────────────────
    private fun updatePreview() {
        val p = selectedProblem ?: return
        codeBorder.title = "${p.language}  /  ${p.templateFile}"
        codeArea.text = loadTemplate(p.resourcePath)
            ?: "// 템플릿 파일을 찾을 수 없습니다: ${p.resourcePath}"
        codeArea.caretPosition = 0
    }

    // ── 파일 생성 ─────────────────────────────────────────────
    private fun createFile() {
        val p = selectedProblem ?: run {
            Messages.showWarningDialog(project, "먼저 문제를 선택해주세요.", "문제 미선택")
            return
        }
        val content = loadTemplate(p.resourcePath) ?: run {
            Messages.showErrorDialog(project, "템플릿 파일을 찾을 수 없습니다: ${p.resourcePath}", "오류")
            return
        }

        val descriptor = FileChooserDescriptorFactory.createSingleFolderDescriptor().apply {
            title = "${p.templateFile}을 생성할 폴더 선택"
        }

        FileChooser.chooseFile(descriptor, project, findInitialDir()) { folder ->
            val existing = folder.findChild(p.templateFile)
            if (existing != null) {
                val ok = Messages.showYesNoDialog(
                    project,
                    "${p.templateFile} 이 이미 존재합니다. 덮어쓰겠습니까?",
                    "덮어쓰기 확인",
                    Messages.getQuestionIcon()
                )
                if (ok != Messages.YES) return@chooseFile
            }

            WriteCommandAction.runWriteCommandAction(project, "Create ${p.templateFile}", null, {
                val vFile = existing ?: folder.createChildData(this, p.templateFile)
                vFile.setBinaryContent(content.toByteArray(Charsets.UTF_8))
                ApplicationManager.getApplication().invokeLater {
                    FileEditorManager.getInstance(project).openFile(vFile, true)
                }
            })
        }
    }

    // ── 클립보드 복사 ─────────────────────────────────────────
    private fun copyToClipboard() {
        val code = codeArea.text.takeIf { it.isNotBlank() } ?: return
        val sel = StringSelection(code)
        Toolkit.getDefaultToolkit().systemClipboard.setContents(sel, sel)
    }

    // ── 템플릿 파일 로드 ──────────────────────────────────────
    private fun loadTemplate(resourcePath: String): String? {
        if (resourcePath.isBlank()) return null
        return MyToolWindow::class.java
            .getResourceAsStream("/templates/$resourcePath")
            ?.bufferedReader(Charsets.UTF_8)
            ?.use { it.readText() }
    }

    // ── 폴더 선택 초기 위치 ───────────────────────────────────
    private fun findInitialDir() =
        project.basePath?.let { LocalFileSystem.getInstance().findFileByPath(it) }
}