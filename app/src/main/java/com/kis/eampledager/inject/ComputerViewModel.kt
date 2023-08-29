package com.kis.eampledager.inject

import android.util.Log
import androidx.lifecycle.ViewModel
import com.kis.eampledager.inject.Di.CustomSingleTon
import javax.inject.Inject

@CustomSingleTon
class ComputerViewModel @Inject constructor(
    private val interfaceComp: ComputerInterface
): ViewModel() {

    fun showWork() {
        Log.d("showLog", "showLoggg")
    }


}