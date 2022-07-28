rootProject.name = "example"

pluginManagement {
    includeBuild("../plugin")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("me.omico.gradle.issue")
}

configure<GradleIssueExtension> { }
// gradleIssue { } // not working
