package com.example.mylibrary.rousetime.android_startup

import com.example.mylibrary.rousetime.android_startup.model.CostTimesModel

/**
 * Created by yysc on 2025/11/29.
 */
interface StartupListener {

    /**
     * call when all startup completed.
     * @param totalMainThreadCostTime cost times of main thread.
     * @param costTimesModels list of cost times for every startup.
     */
    fun onCompleted(totalMainThreadCostTime: Long, costTimesModels: List<CostTimesModel>)
}