package com.kis.eampledager.inject

import android.app.Activity
import com.kis.eampledager.MainActivity

@dagger.Component(modules = [ShowLolModul::class, InterfaceModule::class])
interface DagComponent {

    fun inject(anotherActivity: MainActivity)

}