package com.masorone.di.example1

class Activity {

    private val monitor = Monitor()
    private val storage = Storage()
    private val memory = Memory()
    private val processor = Processor()
    private val computerTower = ComputerTower(
        storage,
        memory,
        processor
    )
    private val keyBoard = KeyBoard()
    private val mouse = Mouse()

    private val computer = Computer(
        monitor,
        computerTower,
        keyBoard,
        mouse
    )
}