plugins {
    id("com.android.library") version "3.5.3"
    kotlin("android") version "1.3.61"
    id("com.yelp.codegen.plugin") version "1.3.0"
    kotlin("kapt") version "1.3.61"
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles("moshi.pro")
        }
    }
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")

    // Moshi + OkHttp + Retrofit
    implementation("com.squareup.moshi:moshi:1.9.2")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.okhttp3:okhttp:3.12.3")
    implementation("com.squareup.retrofit2:retrofit:2.7.1")
    implementation("com.squareup.retrofit2:converter-moshi:2.7.1")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.7.1")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.9.2")

    // Date Support
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.2")

    // RxJava
    implementation("io.reactivex.rxjava2:rxjava:2.2.17")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
}

generateSwagger {
    platform = "kotlin"
    packageName = "com.yelp.codegen.samples"
    specName = "sample_specs"
    specVersion = "1.0.0"
    inputFile = file("../sample_specs.json")
    outputDir = file("./src/main/java/")
    features {
        headersToRemove = arrayOf("Accept-Language")
    }
}

repositories {
    mavenCentral()
}
