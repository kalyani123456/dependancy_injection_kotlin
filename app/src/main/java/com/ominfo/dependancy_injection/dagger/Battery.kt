package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init{
        Log.i("MYTAG","Battery Constructor")
    }

    fun getPower(){
        Log.i("MYTAG","Battery is available")
    }
}
