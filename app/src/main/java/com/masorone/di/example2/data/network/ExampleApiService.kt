package com.masorone.di.example2.data.network

import android.content.Context
import android.util.Log
import com.masorone.di.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currentTime: Long
) {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleApiService ${context.getString(R.string.app_name)} $currentTime")
    }
}