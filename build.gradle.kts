import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://iitpack.io")}
    }
}

subprojects {
    group = "org.cat.eye.otus.finance"
    version = "1.0.0-SNAPSHOT"

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }
}