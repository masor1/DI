package com.masorone.di.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.masorone.di.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when (modelClass) {
            ExampleViewModel::class.java -> ExampleViewModel(useCase) as T
            else -> throw RuntimeException("Unknown ViewModel class: $modelClass")
        }
    }
}