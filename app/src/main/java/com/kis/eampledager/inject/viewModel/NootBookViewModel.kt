package com.kis.eampledager.inject.viewModel

import androidx.lifecycle.ViewModel
import com.kis.eampledager.inject.Di.CustomSingleTon
import com.kis.eampledager.inject.iterfaces.NootBookInterface
import javax.inject.Inject

@CustomSingleTon
class NootBookViewModel @Inject constructor(
    private val interfaceNootbook: NootBookInterface
) : ViewModel() {


    fun showExampleViewModel(): String {
        interfaceNootbook.showNootBookParametrs()
        return "Some"
    }
}