@file:Suppress("unused")

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.create

class GradleIssuePlugin : Plugin<Any> {
    override fun apply(target: Any) {
        when (target) {
            is Settings -> target.extensions.create("gradleIssue", GradleIssueExtension::class)
            is Project -> target.extensions.create("gradleIssue", GradleIssueExtension::class)
        }
    }
}
