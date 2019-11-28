package com.monkeydp.daios.dm.plugin.tasks

import com.monkeydp.daios.dm.plugin.DmPluginExt
import com.monkeydp.daios.dm.plugin.constant.DmRegex
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

/**
 * @author iPotato
 * @date 2019/11/28
 */
open class CopyLibsToDist
@Inject constructor(private val pluginExt: DmPluginExt)
    : AbstractDmTask() {
    
    var commonLibsDir = File("${project.rootDir}/src/main/dist/libs/common")
    
    @TaskAction
    fun execute() {
        if (commonLibsDir.exists()) commonLibsDir.deleteRecursively()
        commonLibsDir.mkdir()
        
        val libs = pluginExt.runtimeClasspath.get().filter { it.name.matches(DmRegex.dmBaseJarRegex) }
        
        project.copy {
            it.from(libs)
            it.into(commonLibsDir)
        }
    }
}