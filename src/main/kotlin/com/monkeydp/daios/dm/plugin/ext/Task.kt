package com.monkeydp.daios.dm.plugin.ext

import com.monkeydp.daios.dm.plugin.tasks.CopyLibsToDist
import com.monkeydp.tools.ext.lowerCameCaseName
import org.gradle.api.tasks.TaskContainer
import org.gradle.kotlin.dsl.named

/**
 * @author iPotato
 * @date 2019/12/2
 */
val TaskContainer.copyLibsToDist
    get() = named<CopyLibsToDist>(CopyLibsToDist::class.lowerCameCaseName())