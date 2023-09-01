package com.kis.eampledager.inject.Di

import android.content.Context
import com.kis.eampledager.MainActivity
import com.kis.eampledager.inject.modules.InterfaceModule
import com.kis.eampledager.inject.modules.NootBookModule
import dagger.BindsInstance
import dagger.Component

@CustomSingleTon
@Component(modules = [InterfaceModule::class, NootBookModule::class, ViewModelModule::class])
interface DagComponent {

    fun inject(anotherActivity: MainActivity)

    @Component.Factory
    interface FactoryBuild {

        fun create(
            @BindsInstance cotext: Context,
            @BindsInstance time: String,
        ): DagComponent
    }

}