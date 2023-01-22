package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

//make the interface
interface Battery{
    fun getPower()
}

/*class Battery @Inject constructor(){
    init{
        Log.i("MYTAG","Battery Constructor")
    }

    fun getPower(){
        Log.i("MYTAG","Battery is available")
    }
}
*/
