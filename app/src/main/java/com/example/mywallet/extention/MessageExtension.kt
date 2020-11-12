package com.example.mywallet.extention

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes
import com.example.mywallet.R

fun Context.toastMessage(
    @StringRes stringRef: Int? = null,
    text: String? = null,
    isWarning: Boolean = false
) {

    val toast = Toast(this)
    val view = inflate(R.layout.toast_custom)

    val textView = view.findViewById<TextView>(R.id.toast_message)
    textView.text = text ?: this.getString(stringRef!!)

    if (isWarning)
        view.setBackgroundColor(Color.RED)

    toast.view = view
    toast.setGravity(Gravity.FILL_HORIZONTAL or Gravity.BOTTOM, 0, 0)
    toast.duration = Toast.LENGTH_LONG

    toast.show()
}



