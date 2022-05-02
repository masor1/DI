package com.masorone.di.example2.di

import android.content.Context
import com.masorone.di.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface AppComponentFactory {

        fun create(
            @BindsInstance currentTime: Long,
            @BindsInstance context: Context
        ): AppComponent
    }
}