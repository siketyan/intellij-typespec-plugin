plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.4.0"
  id("org.jetbrains.intellij.platform") version "2.17.0"
}

group = "jp.s6n.idea"
version = "0.3.0"

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
    intellijIdeaUltimate("2026.1")
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
      sinceBuild = "251"
      untilBuild = "262.*"
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
