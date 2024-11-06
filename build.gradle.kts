@file:Suppress("SpellCheckingInspection")

plugins {
    java
    `java-library`
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "me.taromati.afreecatvlib"
version = "1.0.7-BETA+12"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://repo.repsy.io/mvn/lone64/paper")
    maven("https://repo.codemc.io/repository/maven-snapshots/")
}

dependencies {
    implementation("org.jsoup:jsoup:1.18.1")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")

    compileOnly("net.kyori:adventure-api:4.13.0")
    compileOnly("net.kyori:adventure-text-serializer-legacy:4.13.0")

    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    compileOnly("commons-io:commons-io:2.16.1")
    compileOnly("org.jetbrains:annotations:20.1.0")
    compileOnly("com.googlecode.json-simple:json-simple:1.1.1")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

java {
    sourceCompatibility = JavaVersion.VERSION_16
    targetCompatibility = JavaVersion.VERSION_16
    toolchain {
        languageVersion = JavaLanguageVersion.of(16)
    }
}

tasks.shadowJar {
    archiveFileName.set("AfreecatvLib.jar")
}