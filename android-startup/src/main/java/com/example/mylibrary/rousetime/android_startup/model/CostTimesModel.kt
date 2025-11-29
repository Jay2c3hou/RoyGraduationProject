package com.example.mylibrary.rousetime.android_startup.model

/**
 * Created by yysc on 2025/11/29.
 */
data class CostTimesModel(
    val name: String,
    val callOnMainThread: Boolean,
    val waitOnMainThread: Boolean,
    val startTime: Long,
    var endTime: Long = 0L
)
