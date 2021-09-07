package com.github.samarjeet93.testplugin.services

import com.intellij.openapi.project.Project
import com.github.samarjeet93.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
