package com.example.mywallet.model

data class TransactionModel(
    val transactionId: String,
    val transactionTime: String,
    val currentStatus: String,
    val description: String,
    val image: String,
    val amount: Double
)