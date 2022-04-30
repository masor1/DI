package com.masorone.di.example1

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val storage = Storage()
        val memory = Memory()
        val processor = Processor()
        val computerTower = ComputerTower(
            storage,
            memory,
            processor
        )
        val keyBoard = KeyBoard()
        val mouse = Mouse()

        return Computer(
            monitor,
            computerTower,
            keyBoard,
            mouse
        )
    }

    fun inject(activity: Activity) {
    }
}