package com.ominfo.dependancy_injection.dagger

import com.ominfo.dependancy_injection.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class,NcBatteryModule::class])
interface SmartPhoneComponent {
    //fun getSmartPhone(): SmartPhone remove this for injecting
    fun inject(mainActivity: MainActivity)
}