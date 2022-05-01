package com.masorone.di.example2.di

import com.masorone.di.example2.data.repository.ExampleRepositoryImpl
import com.masorone.di.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository = impl
}