plugins {
    alias(libs.plugins.library.convention)
    alias(libs.plugins.kotlin.serialization)
}

android { namespace = "com.one2fight.feature.auth.api" }

dependencies {
    implementation(libs.kotlinx.serialization.core)
    implementation(libs.nav3.runtime)
}
