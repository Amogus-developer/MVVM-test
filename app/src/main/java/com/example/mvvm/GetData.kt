package com.example.mvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData(){
        println("data - get")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun senData(){
        println("send data")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun any(){
        println("any")
    }
}