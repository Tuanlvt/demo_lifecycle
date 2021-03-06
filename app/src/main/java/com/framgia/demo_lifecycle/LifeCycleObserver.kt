package com.framgia.demo_lifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

/**
 * Created by FRAMGIA\le.vu.tan.tuan on 09/11/2018.
 * tantuan127@gmail.com
 */
class LifeCycleObserver(private val lifeCycle: Lifecycle, private val logger: Logger) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun logCreate() {
        logger.logCreate()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun logStart() {
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            logger.logStart()
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun logResume() {
        logger.logResume()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun logPause() {
        logger.logPause()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun logStop() {
        logger.logStop()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun logDestroy() {
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.DESTROYED)) {
            logger.logDestroy()
        }
    }
}
