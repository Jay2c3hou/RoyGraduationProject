package com.example.mylibrary.rousetime.android_startup.model

import com.example.mylibrary.rousetime.android_startup.AndroidStartup
import com.example.mylibrary.rousetime.android_startup.provider.StartupProviderConfig

/**
 * Created by yysc on 2025/11/29.
 */
data class StartupProviderStore(
    val result: List<AndroidStartup<*>>,
    val config: StartupProviderConfig?
)
