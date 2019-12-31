package com.monkeydp.daios.dm.plugin.ext

import com.monkeydp.daios.dm.plugin.DmPluginExt
import com.monkeydp.daios.dm.plugin.config.ProjectConfig
import com.monkeydp.tools.ext.kotlin.singleton
import org.gradle.api.Project
import kotlin.properties.Delegates

/**
 * @author iPotato
 * @date 2019/11/29
 */
internal var Project.dmPluginExt by Delegates.singleton<DmPluginExt>(ignoreAlreadyInitialized = true)

fun Project.dmPluginExt(
        @Suppress("unused_parameter")
        init: DmPluginExt.() -> Unit
) {
    dmPluginExt = DmPluginExt(init)
}

val Project.config
    get() = ProjectConfig {
        dist {
            sourcePaths = arrayOf("$buildDir/classes/kotlin/main/com")
            destPath = "classes/com"
        }
    }