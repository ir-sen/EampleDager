package com.kis.eampledager.inject.Di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kis.eampledager.inject.ComputerInterface
import com.kis.eampledager.inject.ComputerViewModel
import javax.inject.Inject

class ViewModelFactoy1 @Inject constructor(
    private val interfaceComp: ComputerInterface
): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == ComputerViewModel::class.java) {
            return ComputerViewModel(interfaceComp) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}