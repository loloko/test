package com.example.mywallet.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mywallet.R
import com.example.mywallet.databinding.ItemTransactionBinding
import com.example.mywallet.extention.TAG
import com.example.mywallet.model.TransactionModel


class TransactionAdapter : RecyclerView.Adapter<TransactionAdapter.MyViewHolder>() {

    private var transactionList: MutableList<TransactionModel> = ArrayList()

    private lateinit var context: Context

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ItemTransactionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context

        return MyViewHolder(binding)
    }

    fun setTransactionList(transaction: List<TransactionModel>?) {
        if (transaction != null)
            transactionList.addAll(transaction)

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(transactionList[position])
    }

    override fun getItemId(position: Int): Long = position.toLong()

    inner class MyViewHolder(private val binding: ItemTransactionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(transaction: TransactionModel) {
            try {
                // Load image url
                Glide.with(context).load(transaction.image)
                    .placeholder(R.drawable.ic_error)
                    .error(R.drawable.ic_error)
                    .centerCrop()
                    .into(binding.image);

                binding.tvDescription.text = transaction.description
                binding.tvAmount.text = transaction.amount.toString()

            } catch (e: Exception) {
                Log.e(TAG, "MyViewHolder:bind ${e.message}")
            }
        }

    }

}



