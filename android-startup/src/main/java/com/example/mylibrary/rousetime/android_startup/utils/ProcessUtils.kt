package com.example.mylibrary.rousetime.android_startup.utils

import android.app.ActivityManager
import android.content.Context
import android.os.Process

/**
 * Created by yysc on 2025/11/29.
 */
internal object ProcessUtils {

    private fun getProcessName(context: Context): String {
        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val myPid = Process.myPid()
        am.runningAppProcesses.forEach {
            if (it.pid == myPid) {
                return it.processName
            }
        }
        return ""
    }

    fun isMainProcess(context: Context): Boolean = getProcessName(context) == context.packageName

    fun isMultipleProcess(context: Context, processName: Array<out String>): Boolean {
        processName.forEach {
            if (getProcessName(context) == "${context.packageName}$it") {
                return true
            }
        }
        return false
    }
}