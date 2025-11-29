package com.example.mylibrary.rousetime.android_startup.dispatcher

import com.example.mylibrary.rousetime.android_startup.Startup
import com.example.mylibrary.rousetime.android_startup.model.StartupSortStore

/**
 * Created by yysc on 2025/11/29.
 */
interface ManagerDispatcher {

    /**
     * dispatch prepare
     */
    fun prepare()

    /**
     * dispatch startup to executing.
     */
    fun dispatch(startup: Startup<*>, sortStore: StartupSortStore)

    /**
     * notify children when dependency startup completed.
     */
    fun notifyChildren(dependencyParent: Startup<*>, result: Any?, sortStore: StartupSortStore)
}