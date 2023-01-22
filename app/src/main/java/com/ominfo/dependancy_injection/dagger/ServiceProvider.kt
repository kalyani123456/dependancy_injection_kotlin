package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init{
        Log.i("MYTAG","Service provider Constructor")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}