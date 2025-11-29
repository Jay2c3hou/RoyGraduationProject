package com.example.mylibrary.rousetime.android_startup.model

import com.example.mylibrary.rousetime.android_startup.Startup

/**
 * Created by yysc on 2025/11/29.
 */
data class StartupSortStore(
    val result: MutableList<Startup<*>>,
    val startupMap: Map<String, Startup<*>>,
    val startupChildrenMap: Map<String, MutableList<String>>
)
