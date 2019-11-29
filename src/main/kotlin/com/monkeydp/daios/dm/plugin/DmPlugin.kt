package com.monkeydp.daios.dm.plugin

import com.monkeydp.daios.dm.plugin.tasks.CopyLibsToDist
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author iPotato
 * @date 2019/11/28
 */
class DmPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("copyLibsToDist", CopyLibsToDist::class.java)
        project.tasks.register("hello") {
            it.group = "dm"
            it.doLast {
                println("Thanks for using dm plugin!")
            }
        }
    }
}