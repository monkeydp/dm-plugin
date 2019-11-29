package com.monkeydp.daios.dm.plugin

import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.artifacts.Configuration

/**
 * @author iPotato
 * @date 2019/11/28
 */
data class DmPluginExt(
        val runtimeClasspath: NamedDomainObjectProvider<Configuration>
)