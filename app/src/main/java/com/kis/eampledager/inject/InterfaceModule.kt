package com.kis.eampledager.inject

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class InterfaceModule {

    @Binds
    abstract fun interfaceBind(impl: ComputerInterfaceImpl): ComputerInterface

}