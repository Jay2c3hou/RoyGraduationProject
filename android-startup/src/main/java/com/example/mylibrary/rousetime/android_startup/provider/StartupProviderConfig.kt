package com.example.mylibrary.rousetime.android_startup.provider

import com.example.mylibrary.rousetime.android_startup.model.StartupConfig

/**
 * Created by yysc on 2025/11/29.
 */
interface StartupProviderConfig {

    fun getConfig(): StartupConfig
}