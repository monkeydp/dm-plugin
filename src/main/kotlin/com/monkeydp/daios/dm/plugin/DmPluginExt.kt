package com.monkeydp.daios.dm.plugin

/**
 * @author iPotato
 * @date 2019/11/28
 */
interface DmPluginExt {
    companion object {
        operator fun invoke(init: DmPluginExt.() -> Unit): DmPluginExt =
                StdDmPluginExt().apply(init)
    }
}

private class StdDmPluginExt : DmPluginExt