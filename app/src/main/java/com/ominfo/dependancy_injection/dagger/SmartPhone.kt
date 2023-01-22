package com.ominfo.dependancy_injection.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(val battery: Battery,
val simCard: SimCard,val memoryCard: MemoryCard,val driver: Driver) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        driver.getDriver()
        Log.i("MYTAG","Smartphone constructed")
    }

    fun makeACallWithRecording(){
        Log.i("MYTAG","Calling.....")
    }
}