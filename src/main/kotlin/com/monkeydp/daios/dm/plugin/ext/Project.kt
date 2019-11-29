package com.monkeydp.daios.dm.plugin.ext

import com.monkeydp.daios.dm.plugin.DmPluginExt
import org.gradle.api.Project

/**
 * @author iPotato
 * @date 2019/11/29
 */
val Project.pluginExt
    get() = extensions.extraProperties["pluginExt"] as DmPluginExt