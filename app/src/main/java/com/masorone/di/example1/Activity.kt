package com.masorone.di.example1

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: KeyBoard

    init {
        Component().inject(this)
    }
}