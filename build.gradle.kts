plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.2.21"
  id("org.jetbrains.intellij.platform") version "2.10.2"
}

group = "jp.s6n.idea"
version = "0.2.7"

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
  intellijPlatform {
    intellijIdeaUltimate("2025.1")
    bundledPlugins(
      "org.jetbrains.plugins.textmate",
      "org.jetbrains.plugins.yaml",
      "JavaScript",
      "NodeJS",
    )

    pluginVerifier()
  }
}

intellijPlatform {
  pluginConfiguration {
    ideaVersion {
      sinceBuild = "243"
      untilBuild = "252.*"
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
