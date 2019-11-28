package com.monkeydp.daios.dm.plugin

import com.monkeydp.tools.ext.notNullSingleton
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.artifacts.Configuration
import kotlin.properties.Delegates

/**
 * @author iPotato
 * @date 2019/11/28
 */
open class DmPluginExt {
    var runtimeClasspath by Delegates.notNullSingleton<NamedDomainObjectProvider<Configuration>>()
}