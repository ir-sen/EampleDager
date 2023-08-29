package com.kis.eampledager.inject.Di

import android.content.Context
import com.kis.eampledager.MainActivity
import com.kis.eampledager.inject.InterfaceModule
import dagger.BindsInstance
import dagger.Component

@CustomSingleTon
@Component(modules = [InterfaceModule::class])
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