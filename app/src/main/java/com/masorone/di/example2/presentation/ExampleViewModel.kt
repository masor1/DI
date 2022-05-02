package com.masorone.di.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.masorone.di.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModel() {

    fun method() {
        Log.d("ExampleViewModel", this.toString())
        useCase.invoke()
    }
}