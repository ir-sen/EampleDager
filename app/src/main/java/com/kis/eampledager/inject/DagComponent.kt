package com.kis.eampledager.inject

import android.content.Context
import com.kis.eampledager.MainActivity
import dagger.BindsInstance
import dagger.Component

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