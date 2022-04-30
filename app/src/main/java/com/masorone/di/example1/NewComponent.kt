package com.masorone.di.example1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)

    fun getKeyBoard(): KeyBoard

    fun getMouse(): Mouse

    fun getMonitor(): Monitor
}