package com.dboy.lifecyclecoroutines

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import kotlinx.coroutines.*

/**
 * Binding life cycle
 * Cancel Job automatically when Activity OnDestroy
 */
fun Job.lifeRecycle(lifecycle: Lifecycle): Job {
    LifeRecycleControl(lifecycle).bind(this)
    return this
}

/**
 * Binding life cycle
 * Cancel Deferred Job automatically when Activity OnDestroy
 */
fun <T> Deferred<T>.lifeRecycle(lifecycle: Lifecycle): Deferred<T> {
    LifeRecycleControl(lifecycle).bind(this)
    return this
}

/**
 * Binding life cycle
 * Cancel CoroutineScope Job automatically when Activity OnDestroy
 */
fun CoroutineScope.lifeRecycle(lifecycle: Lifecycle) {
    LifeRecycleControl(lifecycle).bind(this)
}

/**
 * Life Cycle Controller
 * Bind coroutines and lifecycle
 */
class LifeRecycleControl(private val lifecycle: Lifecycle) {

    fun bind(job: Job) {
        lifecycle.addObserver(object : LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    job.cancelChildren()
                    job.cancel()
                }
            }
        })
    }

    fun <T> bind(deferred: Deferred<T>) {
        lifecycle.addObserver(object : LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    deferred.cancelChildren()
                    deferred.cancel()
                }
            }
        })
    }

    fun bind(coroutineScope: CoroutineScope) {
        lifecycle.addObserver(object : LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    coroutineScope.cancel()
                }
            }
        })
    }

}