plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.nimble_technicaltest"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.nimble_technicaltest"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.room:room-coroutines:2.1.0-alpha04")
    // JETPACK COMPOSE
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling:1.5.4")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-util-desktop:1.6.0-alpha08")
    implementation("androidx.compose.foundation:foundation-desktop:1.6.0-alpha08")
    implementation("androidx.compose.runtime:runtime-livedata:1.5.4")
    implementation("androidx.compose.material:material-icons-extended-desktop:1.6.0-alpha08")
    implementation("io.coil-kt:coil-compose:2.4.0")
    // PAGING
    implementation("androidx.paging:paging-compose:3.2.1")
    implementation("androidx.paging:paging-common-android:3.3.0-alpha02")
    implementation("androidx.paging:paging-runtime-ktx:3.2.1")
    // DATASTORE
    implementation("androidx.datastore:datastore-preferences-android:1.1.0-alpha06")
    // HILT
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    implementation("androidx.hilt:hilt-common:1.1.0")
    implementation("androidx.hilt:hilt-work:1.1.0")
    implementation("androidx.hilt:hilt-compiler:1.1.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")
    // OKHTTP3 Implementation
    implementation("'com.squareup.okhttp3:logging-interceptor:4.11.0'")

    //RETROFIT
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation ("com.squareup.retrofit2:converter-scalars")

    // ROOM
    implementation("androidx.room:room-common:2.6.0")
    implementation("androidx.room:room-paging:2.6.0")
    annotationProcessor("androidx.room:room-compiler:2.6.0")
    implementation("androidx.room:room-ktx:2.6.0")
    testImplementation("androidx.room:room-testing:2.6.0")
    implementation("androidx.room:room-runtime:2.6.0")
    // TIMBER
    api("com.jakewharton.timber:timber:5.0.1")
    //GSON for GET request
    api("com.google.code.gson:gson:2.10.1")
    // DESUGAR
    implementation("com.android.tools:desugar_jdk_libs:2.0.4")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}