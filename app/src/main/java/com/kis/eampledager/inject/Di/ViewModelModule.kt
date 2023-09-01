package com.kis.eampledager.inject.Di

import androidx.lifecycle.ViewModel
import com.kis.eampledager.inject.viewModel.ComputerViewModel
import com.kis.eampledager.inject.viewModel.NootBookViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @StringKey("ComputerViewModel")
    @Binds
    fun bindComputerViewModel(impl: ComputerViewModel): ViewModel

    @IntoMap
    @StringKey("NootBookViewModel")
    @Binds
    fun bindExampleViewModel(impl: NootBookViewModel): ViewModel
}