package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class MemoryCard  { //remove @Inject constructor() and create module
    //because sometimes we cannot add inject constructor to retrofit/ third party library
    init{
        Log.i("MYTAG","Memory card Constructor")
    }

    fun getSpaceAvailability(){
        Log.i("MYTAG","Memory space available")
    }
}