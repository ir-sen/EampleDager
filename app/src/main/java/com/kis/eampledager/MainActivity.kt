package com.kis.eampledager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kis.eampledager.inject.*
import dagger.internal.DaggerGenerated
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    @Inject
    lateinit var showLol: ShowLol



    private val component by lazy {
        DaggerDagComponent
            .factory()
            .create(this,
                 System.currentTimeMillis().toString()
            )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        computer.showWork()
        val showTime = showLol
        Log.d("TAGActivity", showLol.contextString())
        Log.d("TAGActivity", showLol.showStringTime())
    }

}