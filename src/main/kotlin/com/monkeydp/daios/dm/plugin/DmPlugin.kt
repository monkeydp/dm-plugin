package com.monkeydp.daios.dm.plugin

import com.monkeydp.daios.dm.plugin.tasks.CopyLibsToDist
import com.monkeydp.tools.ext.kotlin.lowerCameCaseName
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskContainer
import kotlin.reflect.KClass

/**
 * @author iPotato
 * @date 2019/11/28
 */
class DmPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.registerSingleton(CopyLibsToDist::class)
        project.tasks.register("hello") {
            it.group = "dm"
            it.doLast {
                println("Thanks for using dm plugin!")
            }
        }
    }
    
    private fun <T : Task> TaskContainer.registerSingleton(kType: KClass<T>) =
            register(kType.lowerCameCaseName(), kType.java)
}