package com.kis.eampledager.inject.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.kis.eampledager.inject.Di.CustomSingleTon
import com.kis.eampledager.inject.iterfaces.ComputerInterface
import javax.inject.Inject

@CustomSingleTon
class ComputerViewModel @Inject constructor(
    private val interfaceComp: ComputerInterface
): ViewModel() {

    fun showWork() {
        val list = interfaceComp.showInterfase()
        Log.d("showLog", "$list")
    }


}