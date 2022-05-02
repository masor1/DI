package com.masorone.di.example2.data.network

import android.content.Context
import android.util.Log
import com.masorone.di.R
import com.masorone.di.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currentTime: Long
) {

    fun method() {
        Log.d(
            "EXAMPLE_TEST",
            "ExampleApiService ${context.getString(R.string.app_name)} $currentTime $this"
        )
    }
}