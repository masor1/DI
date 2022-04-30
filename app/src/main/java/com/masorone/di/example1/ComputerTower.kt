package com.masorone.di.example1

import javax.inject.Inject

class ComputerTower @Inject constructor(
    private val storage: Storage,
    private val memory: Memory,
    private val processor: Processor
)