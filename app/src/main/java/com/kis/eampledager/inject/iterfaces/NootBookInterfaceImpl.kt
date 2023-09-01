package com.kis.eampledager.inject.iterfaces

import javax.inject.Inject

class NootBookInterfaceImpl @Inject constructor(): NootBookInterface {

    override fun showNootBookParametrs(): String {
        return "NootBookInterface"
    }
}