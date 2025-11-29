package com.example.mylibrary.rousetime.android_startup.annotation

import android.os.Process

/**
 * Created by yysc on 2025/11/29.
 */
@MustBeDocumented
@Retention
@Target(AnnotationTarget.CLASS)
annotation class ThreadPriority(val priority: Int = Process.THREAD_PRIORITY_DEFAULT)
