package com.masorone.di.example2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleDatabase")
    }
}