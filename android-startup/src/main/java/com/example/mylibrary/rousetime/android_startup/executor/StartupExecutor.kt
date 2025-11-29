package com.example.mylibrary.rousetime.android_startup.executor

import java.util.concurrent.Executor

/**
 * Created by yysc on 2025/11/29.
 */
interface StartupExecutor {

    fun createExecutor(): Executor
}