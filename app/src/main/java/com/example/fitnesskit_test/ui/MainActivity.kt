package com.example.fitnesskit_test.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.fitnesskit_test.databinding.ActivityMainBinding
import com.example.fitnesskit_test.ui.adapter.RecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val recyclerView = binding.recyclerView
        val adapter = RecyclerViewAdapter()
        recyclerView.adapter = adapter

        viewModel.infoL.observe(this) {
            adapter.listInfoL = it
        }
        viewModel.infoT.observe(this) {
            Log.e("testing", it.toString())
        }
    }
}