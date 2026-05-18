plugins {
    kotlin("jvm") version "2.2.21"
}

group = "iscteiul.ista"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("org.antlr:antlr4:4.13.2")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.26.3")
}

kotlin {
    jvmToolchain(23)
}

tasks.test {
    useJUnitPlatform()
}