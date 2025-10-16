plugins {
    kotlin("jvm") version "1.9.20"
    application
}

// Explicitly define source directories to avoid any ambiguity
sourceSets {
    main {
        kotlin.srcDirs("src/main/kotlin")
    }
    test {
        kotlin.srcDirs("src/test/kotlin")
    }
}


dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.kuru.interviewprep.MainKt")
}

tasks.test {
    useJUnitPlatform()
}