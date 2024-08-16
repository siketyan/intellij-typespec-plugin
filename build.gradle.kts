plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.0.10"
  id("org.jetbrains.intellij.platform") version "2.0.1"
}

group = "jp.s6n.idea"
version = "1.0-SNAPSHOT"

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
    webstorm("2024.2")

    instrumentationTools()
    pluginVerifier()
  }
}

intellijPlatform {
  pluginConfiguration {
    ideaVersion {
      sinceBuild = "242"
      untilBuild = "242.*"
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

sourceSets["main"].java.srcDirs("gen")
