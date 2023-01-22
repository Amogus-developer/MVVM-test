package com.example.mvvm

import androidx.lifecycle.LiveData

class MyLifeData: LiveData<String>() {

    fun setValueToLiveData(string: String){
        value = string
    }

    override fun onActive() {
        super.onActive()
        println("onActive")
    }

    override fun onInactive() {
        super.onInactive()
        println("onInactive")
    }
}