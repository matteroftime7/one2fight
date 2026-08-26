plugins {
    alias(libs.plugins.library.convention)
    alias(libs.plugins.kotlin.compose)
}

android { namespace = "com.one2fight.feature.auth.impl" }

dependencies {

//    implementation(libs.androidx.appcompat)
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.material)

    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.material3)


    implementation(project(":feature:auth:api"))
}