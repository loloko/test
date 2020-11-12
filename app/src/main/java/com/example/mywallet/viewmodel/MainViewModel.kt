package com.example.mywallet.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.example.mywallet.R
import com.example.mywallet.extention.TAG
import com.example.mywallet.model.TransactionModel
import com.example.mywallet.repository.TransactionRepository
import com.example.mywallet.util.ResultResource


class MainViewModel : ViewModel() {

    private val repository = TransactionRepository()

    private var _transactionResult = MediatorLiveData<ResultResource<List<TransactionModel>>>()

    fun transactionResultObserver(): LiveData<ResultResource<List<TransactionModel>>> =
        _transactionResult

    fun fetchAllTransaction() {
        try {
            // Display bottom loading progress bar
            _transactionResult.value = ResultResource.Loading


            // Load list
            // repository.fetchAllTransaction()

        } catch (e: Exception) {
            Log.e(TAG, "fetchAllTransaction: ${e.message}")
            _transactionResult.value = ResultResource.Error(R.string.error)
        }
    }


}


