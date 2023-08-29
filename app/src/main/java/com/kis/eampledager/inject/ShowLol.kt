package com.kis.eampledager.inject

import android.content.Context
import com.kis.eampledager.R
import com.kis.eampledager.inject.Di.CustomSingleTon
import javax.inject.Inject

@CustomSingleTon
class ShowLol @Inject constructor(
    val context: Context,
    val time: String,
) {

    fun contextString(): String {
        return context.getString(R.string.app_name)
    }

    fun showStringTime(): String {
        return time
    }
}