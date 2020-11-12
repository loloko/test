package com.example.mywallet.extention

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes


val Any.TAG: String
    get() {
        val tag = javaClass.simpleName
        return if (tag.length <= 23) tag else tag.substring(0, 23)
    }

fun Context.inflate(@LayoutRes layoutRes: Int): View {
    return LayoutInflater.from(this).inflate(layoutRes, null)
}