package com.masorone.di.example2.data.database

import android.content.Context
import android.util.Log
import com.masorone.di.R
import com.masorone.di.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val currentTime: Long
) {

    fun method() {
        Log.d("EXAMPLE_TEST", "ExampleDatabase ${context.getString(R.string.app_name)} $currentTime $this")
    }
}