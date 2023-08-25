package com.kis.eampledager.inject

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ShowLolModul(private val contextw: Context) {

    @Provides
    fun showModuleRetur(): ShowLol {
        return ShowLol(context = contextw)
    }


}