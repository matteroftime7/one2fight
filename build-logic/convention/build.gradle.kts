import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.`kotlin-dsl`


plugins {
    `kotlin-dsl`
}


dependencies {


//
//    compileOnly(libs.android.gradlePlugin)
//    compileOnly(libs.kotlin.gradlePlugin)
//
//    // Workaround for version catalog working inside precompiled scripts
//    // Issue - https://github.com/gradle/gradle/issues/15383
//    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

gradlePlugin {
//    plugins {
//        register("libraryConventionPlugin") {
//            id = "app.one2work.library.plugin"
//            implementationClass = "LibraryConventionPlugin"
//        }
//        register("applicationConventionPlugin") {
//            id = "app.one2work.application.plugin"
//            implementationClass = "ApplicationConventionPlugin"
//        }
//    }
}
