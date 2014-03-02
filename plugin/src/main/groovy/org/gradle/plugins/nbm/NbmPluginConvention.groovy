package org.gradle.plugins.nbm

import org.gradle.api.Project

class NbmPluginConvention {
    final Project project

    NbmPluginConvention(Project project) {
        this.project = project
    }

    File getOutputFile() {
        project.file("$project.buildDir/gradle-module.nbm")
    }

    File getNbmBuildDir() {
        project.file("$project.buildDir/nbm")
    }

    File getModuleBuildDir() {
        project.file("$project.buildDir/module")
    }

    File getGeneratedManifestFile() {
        project.file("$project.buildDir/module/manifest.mf")
    }

    String getModuleName() {
        project.property("MODULE_NAME")
    }
}
