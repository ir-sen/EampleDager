package com.kis.eampledager.inject.Di

import com.kis.eampledager.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent


@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(anotherActivity: MainActivity)

    @Subcomponent.Factory
    interface FactoryCom {

        fun create(
            @BindsInstance number: Long
        ): ActivityComponent
    }
}