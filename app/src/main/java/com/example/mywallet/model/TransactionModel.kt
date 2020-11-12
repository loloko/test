package com.example.mywallet.model

data class TransactionModel(
    val currentStatus: String,
    val debitedFrom: DebtorModel,
    val creditedTo: CreditorModel,
    val category: CategoryModel?,
    val amount: AmountModel
)

data class DebtorModel(val name: String)

data class CreditorModel(val name: String)

data class CategoryModel(val name: String, val avatarUri: ImageModel)

data class AmountModel(val currency: String, val totalAmountMinor: Int)

data class ImageModel(val avatarUriPng: String)

