package com.example.mywallet.util

import androidx.annotation.StringRes

sealed class ResultResource<out T> {
    data class Success<out T>(val data: T?) :
        ResultResource<T>() // Status success and data of the result

    data class Error(@StringRes val msg: Int) :
        ResultResource<Nothing>() // Status Error an error message

    data class Empty(@StringRes val msg: Int) :
        ResultResource<Nothing>()

    object Loading : ResultResource<Nothing>() // Status to display loading popup

}