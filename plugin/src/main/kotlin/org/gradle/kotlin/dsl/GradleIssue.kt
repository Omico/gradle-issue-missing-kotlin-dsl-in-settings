package org.gradle.kotlin.dsl

import GradleIssueExtension
import org.gradle.api.Action
import org.gradle.api.initialization.Settings

val Settings.gradleIssue: GradleIssueExtension
    get() = extensions.getByType()

fun Settings.gradleIssue(configure: Action<GradleIssueExtension>) =
    extensions.configure("gradleIssue", configure)
