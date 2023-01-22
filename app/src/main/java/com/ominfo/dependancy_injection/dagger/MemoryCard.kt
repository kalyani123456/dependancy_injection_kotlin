package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor() {
    init{
        Log.i("MYTAG","Memory card Constructor")
    }

    fun getSpaceAvailability(){
        Log.i("MYTAG","Memory space available")
    }
}