package com.masorone.di.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.masorone.di.example2.domain.ExampleRepository
import com.masorone.di.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
) : ViewModel() {

    fun method() {
        Log.d("ExampleViewModel", this.toString())
        repository.method()
    }
}