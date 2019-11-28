package com.monkeydp.daios.dm.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author iPotato
 * @date 2019/11/28
 */
class DmPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("hello") {
            it.doLast {
                println("Thanks for using dm plugin!")
            }
        }
    }
}