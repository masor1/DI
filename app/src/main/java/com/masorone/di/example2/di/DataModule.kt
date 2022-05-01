package com.masorone.di.example2.di

import android.content.Context
import com.masorone.di.example2.data.datasource.ExampleLocalDataSource
import com.masorone.di.example2.data.datasource.ExampleLocalDataSourceImpl
import com.masorone.di.example2.data.datasource.ExampleRemoteDataSource
import com.masorone.di.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule(
    private val context: Context
) {

    @Provides
    fun provideContext() = context

    @Provides
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource = impl

    @Provides
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource = impl
}