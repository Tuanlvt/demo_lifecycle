package com.framgia.demo_lifecycle

import android.util.Log

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 09/11/2018.
 * tantuan127@gmail.com
 */
class Logger {

    companion object {
        private const val TAG = "Logger"
    }

    fun logCreate() {
        Log.d(TAG, "Activity created")
    }

    fun logStart() {
        Log.d(TAG, "Activity started")
    }

    fun logResume() {
        Log.d(TAG, "Activity resumed")
    }

    fun logPause() {
        Log.d(TAG, "Activity will pause")
    }

    fun logStop() {
        Log.d(TAG, "Activity will stop")
    }

    fun logDestroy() {
        Log.d(TAG, "Activity will be destroyed")
    }
}
