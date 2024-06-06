plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.dependencyapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dependencyapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {


    // local library module dependency
    // implementation(":myLibrary")


    // local binary dependency

    // implementation fileTree(dir:'libs',includes:['*.jar'])
    // implement files ('libs/foo.jar','libs/bar.jar')no

    // remote binary dependency
    // implementation(com.example.android:app-magic:12.3;)

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.github.bumptech.glide:glide:4.13.2")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")



}