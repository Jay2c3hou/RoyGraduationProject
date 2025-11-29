package com.example.mylibrary.rousetime.android_startup.extensions

import com.example.mylibrary.rousetime.android_startup.Startup

/**
 * Created by yysc on 2025/11/29.
 */

private const val DEFAULT_KEY = "com.rousetime.android_startup.defaultKey"

internal fun Class<out Startup<*>>.getUniqueKey(): String {
    return "$DEFAULT_KEY:$name"
}

internal fun String.getUniqueKey(): String = "$DEFAULT_KEY:$this"