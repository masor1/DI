package com.masorone.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masorone.di.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()

        activity.keyboardInject.toString()
        activity.mouseInject.toString()
        activity.monitorInject.toString()
    }
}