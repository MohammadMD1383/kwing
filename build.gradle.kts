import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.21"
	`java-library`
}

group = "ir.mmd.ktdev"
version = "0.2.0"

java {
	withSourcesJar()
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test"))
}

tasks.test {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = JavaVersion.VERSION_17.toString()
		freeCompilerArgs = listOf("-Xcontext-receivers")
	}
}