package com.masorone.di.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masorone.di.R
import com.masorone.di.example2.di.DaggerAppComponent
import com.masorone.di.example2.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val appComponent by lazy {
        DaggerAppComponent.builder()
            .dataModule(DataModule(this))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}