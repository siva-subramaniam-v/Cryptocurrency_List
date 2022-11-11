package com.example.cryptocurrencylist.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptocurrencylist.R
import com.example.cryptocurrencylist.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentOverviewBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_overview, container, false)

        binding.lifecycleOwner = this

        val overviewViewModel = ViewModelProvider(this)[OverviewViewModel::class.java]

        binding.overviewViewModel = overviewViewModel

        val adapter = CryptoDetailsAdapter()
        binding.cryptoList.adapter = adapter

        overviewViewModel.cryptoList.observe(viewLifecycleOwner) {
            it?.let {
                adapter.submitList(it)
            }
        }

        return binding.root
    }
}