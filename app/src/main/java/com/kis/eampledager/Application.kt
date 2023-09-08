package com.kis.eampledager

import android.app.Application
import com.kis.eampledager.inject.Di.DaggerDagComponent

class ApplicationApp: Application() {

    val component by lazy {
        DaggerDagComponent
            .factory()
            .create(this,
                System.currentTimeMillis().toString(),
                1L
            )
    }


}