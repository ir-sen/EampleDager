package com.kis.eampledager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kis.eampledager.inject.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    @Inject
    lateinit var showLol: ShowLol



    private val component by lazy {
        DaggerDagComponent.builder()
            .showLolModul(ShowLolModul(this))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        computer.showWork()
        Log.d("TAGActivity", showLol.contextString())
    }

}