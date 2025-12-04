plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.arturgesiarz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


kotlin {
    jvmToolchain(24)
}