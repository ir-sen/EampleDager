package com.kis.eampledager.inject

import android.content.Context
import com.kis.eampledager.R
import javax.inject.Inject

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