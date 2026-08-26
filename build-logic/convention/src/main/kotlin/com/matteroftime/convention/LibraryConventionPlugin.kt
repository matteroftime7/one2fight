package com.matteroftime.convention

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.Actions.with
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class LibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {

        with(target) {
            apply(plugin = "com.android.library")
        }

        target.extensions.configure<LibraryExtension> {
            compileSdk = target.libs.versions.compileSdk.get().toInt()

            defaultConfig {
                minSdk = target.libs.versions.minSdk.get().toInt()
            }

            compileOptions {
                sourceCompatibility = JavaVersion.toVersion(target.libs.versions.java.get().toInt())
                targetCompatibility = JavaVersion.toVersion(target.libs.versions.java.get().toInt())
            }
        }
    }
}
