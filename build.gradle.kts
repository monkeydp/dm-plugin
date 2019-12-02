import org.gradle.api.JavaVersion.VERSION_1_8
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // kotlin
    val kotlinVersion = "1.3.50"
    kotlin("jvm") version kotlinVersion
}

group = "com.monkeydp.daios.dm"
version = "0.0.4-SNAPSHOT"
java.sourceCompatibility = VERSION_1_8

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    // tools
    implementation("com.monkeydp:tools")
    // test
    testImplementation("junit:junit:4.12")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = VERSION_1_8.toString()
    }
}