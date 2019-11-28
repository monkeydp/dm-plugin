package com.monkeydp.daios.dm.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * @author iPotato
 * @date 2019/11/28
 */
open class CopyLibsToDist : DefaultTask() {
    
    @Input
    lateinit var libs: FileCollection
    var commonLibsDir = File("${project.rootDir}/src/main/dist/libs/common")
    
    @TaskAction
    fun execute() {
        if (commonLibsDir.exists()) commonLibsDir.deleteRecursively()
        commonLibsDir.mkdir()
        project.copy {
            it.from(libs)
            it.into(commonLibsDir)
        }
    }
}