package com.kis.eampledager.inject

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(
    private val interfaceComp: ComputerInterface
) {

    fun showWork() {
        Log.d("showLog", "showLoggg")
    }


}