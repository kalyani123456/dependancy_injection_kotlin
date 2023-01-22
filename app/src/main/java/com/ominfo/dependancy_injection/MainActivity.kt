package com.ominfo.dependancy_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ominfo.dependancy_injection.dagger.SmartPhone
import com.ominfo.dependancy_injection.dagger.SmartPhoneApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* DaggerSmartPhoneComponent.create().getSmartPhone()
            .makeACallWithRecording()*/

        //field injection for avoiding above

       /* DaggerSmartPhoneComponent.create().inject(this)
        smartPhone.makeACallWithRecording()*/

        //state of a module
        //if you want to pass some values to modules

        //application instance
        (application as SmartPhoneApplication).smartPhoneComponent.inject(this)
        smartPhone.makeACallWithRecording()

            //prolem is that it will invoke this function every time activity runs

        //so do singleton
    }
}