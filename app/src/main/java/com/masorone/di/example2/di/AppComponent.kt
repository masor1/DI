package com.masorone.di.example2.di

import com.masorone.di.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}