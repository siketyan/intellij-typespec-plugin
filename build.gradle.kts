plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.1.10"
  id("org.jetbrains.intellij.platform") version "2.2.1"

  kotlin("plugin.serialization") version "2.1.10"
}

group = "jp.s6n.idea"
version = "0.2.3"

kotlin {
  jvmToolchain(21)
}

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

  intellijPlatform {
    intellijIdeaUltimate("251.18673.35")
    bundledPlugins(
      "org.jetbrains.plugins.textmate",
      "org.jetbrains.plugins.yaml",
      "NodeJS",
    )

    pluginVerifier()
  }
}

intellijPlatform {
  pluginConfiguration {
    ideaVersion {
      sinceBuild = "243"
      untilBuild = "251.*"
    }
  }

  pluginVerification {
    ides {
      recommended()
    }
  }

  signing {
    certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN")
    privateKey = providers.environmentVariable("PRIVATE_KEY")
    password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
  }

  publishing {
    token = providers.environmentVariable("PUBLISH_TOKEN")
  }
}

tasks {
  prepareSandbox {
    from(layout.projectDirectory.dir("textmate")) {
      into(pluginName.map { "$it/textmate" })
    }
  }
}
