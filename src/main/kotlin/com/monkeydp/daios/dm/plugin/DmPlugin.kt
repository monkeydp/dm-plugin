package com.monkeydp.daios.dm.plugin

import com.monkeydp.daios.dm.plugin.constant.DmRegex
import com.monkeydp.daios.dm.plugin.tasks.CopyLibsToDist
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author iPotato
 * @date 2019/11/28
 */
class DmPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val ext = project.extensions.create("dmPluginExt", DmPluginExt::class.java)
        project.tasks.register("copyLibsToDist", CopyLibsToDist::class.java) {
            it.libs = ext.runtimeClasspath.get().filter { file ->
                file.name.matches(DmRegex.dmBaseJarRegex)
            }
        }
        project.tasks.register("hello") {
            it.doLast {
                println("Thanks for using dm plugin!")
            }
        }
    }
}