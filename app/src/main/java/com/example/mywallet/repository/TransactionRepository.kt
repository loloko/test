package com.example.mywallet.repository

import android.util.Log
import com.example.mywallet.extention.TAG
import com.example.mywallet.model.TransactionModel
import com.example.mywallet.model.TransactionResult
import com.example.mywallet.util.MOCK_TRANSACTION_LIST
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.Exception

class TransactionRepository {

    fun fetchAllTransaction(): List<TransactionModel>? {
        return try {
            val transactionResultType = object : TypeToken<TransactionResult>() {}.type

            val transactionResult = Gson().fromJson<TransactionResult>(MOCK_TRANSACTION_LIST, transactionResultType)

            transactionResult.transactionList
        } catch (e: Exception) {
            Log.e(TAG, "fetchAllTransaction: ${e.message}")
            null
        }
    }
}