package com.monkeydp.daios.dm.plugin.config

import com.monkeydp.tools.ext.initInstance

/**
 * @author iPotato
 * @date 2019/12/2
 */
class ProjectConfig() {
    lateinit var dist: DistConfig
    
    fun dist(init: DistConfig.() -> Unit) {
        dist = initInstance<DistConfig>(init)
    }
    
    class DistConfig {
        lateinit var sourcePaths: Array<String>
        lateinit var destPath: String
    }
}

fun projectConfig(init: ProjectConfig.() -> Unit) = initInstance<ProjectConfig>(init)