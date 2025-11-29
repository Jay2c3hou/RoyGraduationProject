package com.example.mylibrary.rousetime.android_startup.annotation

/**
 * Created by yysc on 2025/11/29.
 */
@MustBeDocumented
@Retention
@Target(AnnotationTarget.CLASS)
annotation class MultipleProcess(vararg val process: String)
