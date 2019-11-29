package com.monkeydp.daios.dm.plugin.ext

import com.monkeydp.daios.dm.plugin.DmPluginExt
import com.monkeydp.tools.ext.notNullSingleton
import org.gradle.api.Project
import kotlin.properties.Delegates

/**
 * @author iPotato
 * @date 2019/11/29
 */
var Project.dmPluginExt by Delegates.notNullSingleton<DmPluginExt>(true)