package com.ominfo.dependancy_injection.dagger

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone
}