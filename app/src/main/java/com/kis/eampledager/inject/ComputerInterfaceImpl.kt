package com.kis.eampledager.inject

import android.util.Log
import javax.inject.Inject

class ComputerInterfaceImpl @Inject constructor(): ComputerInterface {

    override fun showInterfase(): String {
        return "Interface Test"
    }

}