package com.github.lincanzhong.channeltemplate.services

import com.intellij.openapi.project.Project
import com.github.lincanzhong.channeltemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
