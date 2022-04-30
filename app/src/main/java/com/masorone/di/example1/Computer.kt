package com.masorone.di.example1

import javax.inject.Inject

class Computer @Inject constructor(
    private val monitor: Monitor,
    private val computerTower: ComputerTower,
    private val keyBoard: KeyBoard,
    private val mouse: Mouse
)