package com.example.mywallet.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mywallet.R
import com.example.mywallet.databinding.ItemTransactionBinding
import com.example.mywallet.extention.TAG
import com.example.mywallet.extention.formatterCurrency
import com.example.mywallet.model.TransactionModel
import java.util.*
import kotlin.collections.ArrayList


class TransactionAdapter : RecyclerView.Adapter<TransactionAdapter.MyViewHolder>(), Filterable {

    private val transactionList: MutableList<TransactionModel> = ArrayList()
    private var transactionListFilter: MutableList<TransactionModel> = ArrayList()
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
        if (transaction == null)
            return

        transactionList.clear()
        transactionListFilter.clear()


        transactionList.addAll(transaction)
        transactionListFilter.addAll(transaction)

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return transactionListFilter.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(transactionListFilter[position])
    }

    override fun getItemId(position: Int): Long = position.toLong()

    inner class MyViewHolder(private val binding: ItemTransactionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(transaction: TransactionModel) {
            try {
                // Load image url
                Glide.with(context).load(transaction.category?.avatarUri?.avatarUriPng)
                    .placeholder(R.drawable.ic_error)
                    .error(R.drawable.ic_error)
                    .centerCrop()
                    .into(binding.image)

                binding.tvDebitedFrom.text = transaction.debitedFrom.name
                binding.tvCreditedTo.text = transaction.creditedTo.name


                if (transaction.currentStatus == "REJECTED") {
                    binding.tvStatus.visibility = View.VISIBLE
                    binding.tvStatus.setText(R.string.rejected)
                    binding.tvStatus.setTextColor(Color.RED)
                } else {
                    binding.tvStatus.visibility = View.GONE
                }


                // Change color when debit or credit
                if (transaction.amount.totalAmountMinor > 0)
                    binding.tvAmount.setTextColor(context.getColor(R.color.blue))
                else
                    binding.tvAmount.setTextColor(context.getColor(R.color.red))


                binding.tvAmount.text = transaction.amount.totalAmountMinor.formatterCurrency()
                binding.tvCurrency.text = transaction.amount.currency


            } catch (e: Exception) {
                Log.e(TAG, "MyViewHolder:bind ${e.message}")
            }
        }

    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val resultList: MutableList<TransactionModel> = ArrayList()

                val charSearch = constraint.toString()

                for (row in transactionList)
                    if (row.debitedFrom.name.toLowerCase(Locale.ROOT).contains(charSearch.toLowerCase(Locale.ROOT)))
                        resultList.add(row)
                    else if (row.creditedTo.name.toLowerCase(Locale.ROOT).contains(charSearch.toLowerCase(Locale.ROOT)))
                        resultList.add(row)


                transactionListFilter.clear()
                transactionListFilter.addAll(resultList)

                val filterResults = FilterResults()
                filterResults.values = transactionListFilter
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {

                transactionListFilter = results?.values as MutableList<TransactionModel>
                notifyDataSetChanged()
            }
        }
    }

}



