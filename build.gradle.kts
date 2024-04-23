plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("com.google.code.gson:gson:2.10.1")

    testImplementation(
        "org.jetbrains.kotlin:kotlin-test",
        "org.junit.jupiter:junit-jupiter-api:5.7.0",
        "org.junit.jupiter:junit-jupiter-params:5.10.2",
        "io.mockk:mockk:1.12.0" )
        // Добавление движка JUnit Jupiter для запуска тестов
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

    }


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(14)
}