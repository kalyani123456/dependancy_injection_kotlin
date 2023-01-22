package com.ominfo.dependancy_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ominfo.dependancy_injection.dagger.DaggerSmartPhoneComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent.create().getSmartPhone()
            .makeACallWithRecording()
    }
}