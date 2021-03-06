import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.21"
	`java-library`
	`maven-publish`
}

group = "ir.mmd.ktdev"
version = "0.2.2"

java {
	withSourcesJar()
}

publishing {
	publications {
		register("release", MavenPublication::class) {
			from(components["java"])
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
		jvmTarget = JavaVersion.VERSION_1_8.toString()
		freeCompilerArgs = listOf("-Xcontext-receivers")
	}
}