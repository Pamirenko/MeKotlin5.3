package com.example.mekotlin53.presentationUi.fragments.onbord

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mekotlin53.R
import com.example.mekotlin53.data.PreferenceHelper
import com.example.mekotlin53.databinding.FragmentOnBordPagingFirstBinding

class OnBordPagingFirst : Fragment() {
    private lateinit var biding: FragmentOnBordPagingFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        biding = FragmentOnBordPagingFirstBinding.inflate(layoutInflater)
        return biding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        biding.skip.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            val preferenceHelper = PreferenceHelper(requireContext())
            preferenceHelper.isShovOnBoard = true
        }
    }

}