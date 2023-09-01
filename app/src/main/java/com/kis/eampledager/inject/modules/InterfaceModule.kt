package com.kis.eampledager.inject.modules

import com.kis.eampledager.inject.iterfaces.ComputerInterface
import com.kis.eampledager.inject.iterfaces.ComputerInterfaceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class InterfaceModule {

    @Binds
    abstract fun interfaceBind(impl: ComputerInterfaceImpl): ComputerInterface


}