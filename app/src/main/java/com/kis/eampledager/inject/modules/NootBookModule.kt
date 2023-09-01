package com.kis.eampledager.inject.modules

import com.kis.eampledager.inject.iterfaces.NootBookInterface
import com.kis.eampledager.inject.iterfaces.NootBookInterfaceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class NootBookModule {

    @Binds
    abstract fun bindNootBook(impl: NootBookInterfaceImpl): NootBookInterface

}