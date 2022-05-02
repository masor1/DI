package com.masorone.di.example2.di

import android.content.Context
import com.masorone.di.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface AppComponentBuilder {

        @BindsInstance
        fun currentTime(currentTime: Long): AppComponentBuilder

        @BindsInstance
        fun context(context: Context): AppComponentBuilder

        fun build(): AppComponent
    }
}