package com.masorone.di.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masorone.di.R
import com.masorone.di.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val appComponent by lazy {
        DaggerAppComponent.factory().create(System.currentTimeMillis(), application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}