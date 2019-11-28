package com.monkeydp.daios.dm.plugin.tasks

import org.gradle.api.DefaultTask

/**
 * @author iPotato
 * @date 2019/11/28
 */
abstract class AbstractDmTask : DefaultTask() {
    init {
        group = "dm"
    }
}