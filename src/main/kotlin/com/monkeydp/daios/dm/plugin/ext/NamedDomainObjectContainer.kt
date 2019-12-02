package com.monkeydp.daios.dm.plugin.ext

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.artifacts.Configuration

/**
 * @author iPotato
 * @date 2019/12/2
 */
val NamedDomainObjectContainer<Configuration>.runtimeClasspath: NamedDomainObjectProvider<Configuration>
    get() = named("runtimeClasspath")