import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    id ("org.jetbrains.kotlin.plugin.serialization") version "2.0.0"
}

kotlin {
    jvm("desktop")
    
    sourceSets {
        val desktopMain by getting
        
        commonMain.dependencies {
            implementation("org.jetbrains.compose.material3:material3-desktop:1.2.1")
            implementation(compose.runtime)
            implementation(compose.foundation)
  //          implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation("org.jetbrains.androidx.navigation:navigation-compose:2.7.0-alpha07")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.core)

        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }
}


compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "org.decentralised.io"
            packageVersion = "1.0.0"
        }
    }
}
dependencies{
    commonMainApi("dev.icerock.moko:mvvm-core:0.16.1")
    commonMainApi("dev.icerock.moko:mvvm-compose:0.16.1")
    commonMainApi("dev.icerock.moko:mvvm-flow:0.16.1")
    commonMainApi("dev.icerock.moko:mvvm-flow-compose:0.16.1")
}
compose.resources {
    publicResClass = true
    packageOfResClass = "me.sample.library.resources"
    generateResClass = always
}