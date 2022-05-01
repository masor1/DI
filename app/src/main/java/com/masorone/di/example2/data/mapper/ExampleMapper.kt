package com.masorone.di.example2.data.mapper

import android.util.Log
import javax.inject.Inject

class ExampleMapper @Inject constructor() {

    fun map() {
        Log.d("EXAMPLE_TEST", "ExampleMapper")
    }
}