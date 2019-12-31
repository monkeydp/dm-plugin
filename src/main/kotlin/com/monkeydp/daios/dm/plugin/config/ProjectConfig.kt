package com.monkeydp.daios.dm.plugin.config

import com.monkeydp.tools.ext.kotlin.singleton
import kotlin.properties.Delegates

/**
 * @author iPotato
 * @date 2019/12/2
 */
interface ProjectConfig {
    var dist: DistConfig
    
    fun dist(init: DistConfig.() -> Unit)
    
    companion object {
        operator fun invoke(init: ProjectConfig.() -> Unit): ProjectConfig =
                StdProjectConfig().apply(init)
    }
}

private class StdProjectConfig : ProjectConfig {
    
    override var dist: DistConfig by Delegates.singleton()
    
    override fun dist(init: DistConfig.() -> Unit) {
        dist = DistConfig(init)
    }
}

interface DistConfig {
    var sourcePaths: Array<String>
    var destPath: String
    
    companion object {
        operator fun invoke(init: DistConfig.() -> Unit): DistConfig =
                StdDistConfig().apply(init)
    }
}

private class StdDistConfig : DistConfig {
    override var sourcePaths: Array<String> by Delegates.singleton()
    override var destPath: String by Delegates.singleton()
}