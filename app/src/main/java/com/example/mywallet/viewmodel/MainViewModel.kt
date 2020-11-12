package com.example.mywallet.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.example.mywallet.R
import com.example.mywallet.model.TransactionModel
import com.example.mywallet.repository.TransactionRepository
import com.example.mywallet.util.ResultResource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainViewModel : ViewModel() {

    private val repository = TransactionRepository()

    private val _transactionResult = MediatorLiveData<ResultResource<List<TransactionModel>>>()

    fun transactionResultObserver(): LiveData<ResultResource<List<TransactionModel>>> =
        _transactionResult

    fun fetchAllTransaction() {

        // Display bottom loading progress bar
        _transactionResult.value = ResultResource.Loading

        // Load list
        // Execute in background
        CoroutineScope(Dispatchers.IO).launch {
            val result = repository.fetchAllTransaction()

            if (result.isNullOrEmpty())
                setValueToMainThread(ResultResource.Error(R.string.error))
            else
                setValueToMainThread(ResultResource.Success(result))
        }

    }

    // Set value in the Main Thread
    private suspend fun setValueToMainThread(value: ResultResource<List<TransactionModel>>) {
        withContext(Dispatchers.Main) {
            _transactionResult.value = value
        }
    }

}


