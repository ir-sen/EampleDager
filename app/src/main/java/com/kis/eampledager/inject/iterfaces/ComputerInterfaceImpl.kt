package com.kis.eampledager.inject.iterfaces

import com.kis.eampledager.inject.iterfaces.ComputerInterface
import javax.inject.Inject

class ComputerInterfaceImpl @Inject constructor(): ComputerInterface {

    override fun showInterfase(): String {
        return "Interface Test"
    }

}