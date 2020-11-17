package com.example.breakingbad.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.breakingbad.base.BaseFragment
import com.example.breakingbad.databinding.CharDetailBinding

class CharacterDetailFragment : BaseFragment() {

    private val TAG = "CharacterDetailFragment"

    private lateinit var binding: CharDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewmodel = mainViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CharDetailBinding.inflate(inflater)

        binding.lifecycleOwner = this

        return binding.root
    }
}