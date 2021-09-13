package com.github.adamathsbc.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.adamathsbc.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
