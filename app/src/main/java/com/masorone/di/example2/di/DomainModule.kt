package com.masorone.di.example2.di

import com.masorone.di.example2.data.repository.ExampleRepositoryImpl
import com.masorone.di.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @ApplicationScope
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}