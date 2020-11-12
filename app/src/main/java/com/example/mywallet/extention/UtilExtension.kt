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

fun Int.formatterCurrency(): String {
    if (this == 0)
        return "0.00"

    val amount = this.toString()
    val first = amount.substring(0, amount.length - 2)
    val last = amount.substring(amount.length - 2)

    return ("$first.$last")
}

fun Context.inflate(@LayoutRes layoutRes: Int): View {
    return LayoutInflater.from(this).inflate(layoutRes, null)
}