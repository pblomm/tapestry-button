package com.github.pblomm.tapestrybutton.services

import com.github.pblomm.tapestrybutton.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
