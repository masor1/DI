package com.masorone.di.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor() = Monitor()

    @Provides
    fun provideStorage() = Storage()

    @Provides
    fun provideMemory() = Memory()

    @Provides
    fun provideProcessor() = Processor()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) = ComputerTower(
        storage,
        memory,
        processor
    )

    @Provides
    fun provideKeyboard() = KeyBoard()

    @Provides
    fun provideMouse() = Mouse()

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyBoard: KeyBoard,
        mouse: Mouse
    ) = Computer(
        monitor,
        computerTower,
        keyBoard,
        mouse
    )
}