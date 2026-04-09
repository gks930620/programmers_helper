plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("org.jetbrains.intellij.platform") version "2.10.2"
}

group = "com.example"
version = "1.0.0"

fun readDotEnvValue(key: String): String? {
    val envFile = rootProject.file(".env")
    if (!envFile.exists()) return null

    return envFile.readLines()
        .asSequence()
        .map { it.trim() }
        .filter { it.isNotEmpty() && !it.startsWith("#") }
        .mapNotNull { line ->
            val equalsIndex = line.indexOf('=')
            if (equalsIndex <= 0) return@mapNotNull null
            val parsedKey = line.substring(0, equalsIndex).trim()
            val parsedValue = line.substring(equalsIndex + 1).trim().trim('"', '\'')
            parsedKey to parsedValue
        }
        .firstOrNull { (parsedKey, _) -> parsedKey == key }
        ?.second
}

val marketplaceToken: String? =
    providers.environmentVariable("JETBRAINS_MARKETPLACE_TOKEN").orNull
        ?: readDotEnvValue("JETBRAINS_MARKETPLACE_TOKEN")

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        intellijIdea("2025.2.4")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add plugin dependencies for compilation here:
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "252.25557"
        }

        changeNotes = """
            Java template helper release
        """.trimIndent()
    }

    publishing {
        if (!marketplaceToken.isNullOrBlank()) {
            token = providers.provider { marketplaceToken!! }
        }
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}
