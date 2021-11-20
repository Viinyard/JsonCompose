package com.github.viinyard.jsoncompose.services

import com.intellij.openapi.project.Project
import com.github.viinyard.jsoncompose.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
