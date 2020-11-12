package com.example.mywallet.ui

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mywallet.R
import com.example.mywallet.adapter.TransactionAdapter
import com.example.mywallet.databinding.ActivityMainBinding
import com.example.mywallet.extention.toastMessage
import com.example.mywallet.util.MarginItemDecoration
import com.example.mywallet.util.ResultResource.*
import com.example.mywallet.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val adapter = TransactionAdapter()

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        initAdapter()
        subscribeObservers()

        viewModel.fetchAllTransaction()

    }

    private fun initAdapter() {
        //recyclerView config

        binding.recyclerTransaction.layoutManager = LinearLayoutManager(this)
        binding.recyclerTransaction.addItemDecoration(
            MarginItemDecoration(
                resources.getDimensionPixelSize(
                    R.dimen.recycler
                )
            )
        )
        binding.recyclerTransaction.adapter = adapter


        // Listener for searching  (Searching View)
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })
    }

    private fun subscribeObservers() {
        viewModel.transactionResultObserver().observe(this) { data ->
            when (data) {
                is Loading -> {
                    toastMessage(R.string.loading)
                }
                is Success -> {

                    // Update adapter
                    adapter.setTransactionList(data.data)
                }
                is Empty -> {
                    toastMessage(R.string.loading)
                }
                is Error -> {

                    toastMessage(data.msg, isWarning = true)
                }
            }
        }
    }
}