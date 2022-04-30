package com.masorone.di.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboardInject: KeyBoard

    @Inject
    lateinit var mouseInject: Mouse

    @Inject
    lateinit var monitorInject: Monitor

    private val component = DaggerNewComponent.create()

    private val keyboardGet: KeyBoard = component.getKeyBoard()

    private val mouseGet: Mouse = component.getMouse()

    private val monitorGet: Monitor = component.getMonitor()

    init {
        component.inject(this)
        keyboardGet.toString()
        mouseGet.toString()
        monitorGet.toString()
    }
}