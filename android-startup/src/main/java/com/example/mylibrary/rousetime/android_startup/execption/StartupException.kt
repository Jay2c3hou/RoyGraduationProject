package com.example.mylibrary.rousetime.android_startup.execption

/**
 * Created by yysc on 2025/11/29.
 */
internal class StartupException : RuntimeException {

    constructor(message: String?) : super(message)

    constructor(t: Throwable) : super(t)
}