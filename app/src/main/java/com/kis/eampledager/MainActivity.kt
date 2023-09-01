package com.kis.eampledager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.kis.eampledager.inject.*
import com.kis.eampledager.inject.Di.ViewModelFactory
import com.kis.eampledager.inject.viewModel.ComputerViewModel
import com.kis.eampledager.inject.viewModel.NootBookViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computerViewModel: ComputerViewModel

    @Inject
    lateinit var viewModelFactory1: ViewModelFactory

    private val viewModel1 by lazy {
        ViewModelProvider(this, viewModelFactory1)[ComputerViewModel::class.java]
    }

    private val nootBookViewModel by lazy {
        ViewModelProvider(this, viewModelFactory1)[NootBookViewModel::class.java]
    }

    @Inject
    lateinit var showLol: ShowLol

    private val TAG = "TAGActivity"

    private val component by lazy {
        (application as ApplicationApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        viewModel1.showWork()

        nootBookViewModel
        val showTime = showLol
        Log.d(TAG, showLol.contextString())
        Log.d(TAG, showLol.showStringTime())
        Log.d(TAG, "ShowLol ${showLol}")
        Log.d(TAG, "ShowLol ${showLol}")
        Log.d(TAG, "Computer ${viewModel1}")
        Log.d(TAG, "Computer ${viewModel1}")

//        Log.d(TAG, "NootBookViewModel ${nootBookViewModel.showExampleViewModel()}")
    }

}