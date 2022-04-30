package com.masorone.di.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer

    private val component = DaggerNewComponent.create()

    init {

        component.inject(this)
    }
}