package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class Driver @Inject constructor() {

    init {
        Log.i("MYTAG","Driver constructed")
    }

    fun getDriver(){
        Log.i("MYTAG","Speaker working")
    }
}