import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.21"
	`java-library`
	`maven-publish`
}

group = "ir.mmd.ktdev"
version = "0.2.0"

java {
	withSourcesJar()
}

publishing {
	repositories {
		maven {
			name = "local"
			url = uri("file://${buildDir}/maven")
		}
	}
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