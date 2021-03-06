package com.masorone.di.example2.di

import com.masorone.di.example2.data.datasource.ExampleLocalDataSource
import com.masorone.di.example2.data.datasource.ExampleLocalDataSourceImpl
import com.masorone.di.example2.data.datasource.ExampleRemoteDataSource
import com.masorone.di.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    @ApplicationScope
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}