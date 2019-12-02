package com.monkeydp.daios.dm.plugin.tasks

import com.monkeydp.daios.dm.plugin.constant.DmRegex
import com.monkeydp.daios.dm.plugin.ext.runtimeClasspath
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * @author iPotato
 * @date 2019/11/28
 */
open class CopyLibsToDist : AbstractDmTask() {
    
    var commonLibsDir = File("${project.rootDir}/src/main/dist/libs/common")
    
    @TaskAction
    fun execute() {
        if (commonLibsDir.exists()) commonLibsDir.deleteRecursively()
        commonLibsDir.mkdir()
        val libs = project.configurations.runtimeClasspath.get().filter { it.name.matches(DmRegex.dmBaseJarRegex) }
        
        project.copy {
            it.from(libs)
            it.into(commonLibsDir)
        }
    }
}