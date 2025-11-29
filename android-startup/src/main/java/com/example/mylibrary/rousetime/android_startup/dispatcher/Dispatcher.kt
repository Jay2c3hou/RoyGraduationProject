package com.example.mylibrary.rousetime.android_startup.dispatcher

/**
 * Created by yysc on 2025/11/29.
 */
interface Dispatcher {

    /**
     * Return true call the create function on main thread otherwise false.
     */
    fun callCreateOnMainThread(): Boolean

    /**
     * Return true block the main thread until the startup completed otherwise false.
     *
     * Note: If the function [callCreateOnMainThread] return true, main thread default block.
     */
    fun waitOnMainThread(): Boolean

    /**
     * To wait dependencies startup completed.
     */
    fun toWait()

    /**
     * To notify the startup when dependencies startup completed.
     */
    fun toNotify()
}