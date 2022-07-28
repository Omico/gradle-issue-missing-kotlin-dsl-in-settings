plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("gradleIssue") {
            id = "me.omico.gradle.issue"
            implementationClass = "GradleIssuePlugin"
        }
    }
}
