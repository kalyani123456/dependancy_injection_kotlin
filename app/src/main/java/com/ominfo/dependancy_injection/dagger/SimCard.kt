package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    init{
        Log.i("MYTAG","SimCard Constructor")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}