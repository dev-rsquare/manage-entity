import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    idea
    kotlin("jvm") version "1.3.41"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.31"
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.31"
}

apply(plugin = "kotlin-jpa")
apply(plugin = "kotlin-allopen")
apply(plugin = "com.github.dcendents.android-maven")


group = "com.github.dev-rsquare"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://jitpack.io")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.9")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.9.9")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("com.github.jitpack:gradle-simple:1.0.5")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    test {
        useJUnit()
    }
}
