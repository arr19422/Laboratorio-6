package com.example.laboratorio5.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.laboratorio5.R
import com.example.laboratorio5.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
            val binding: FragmentHomeBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_home, container, false
            )

            binding.button.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_nav_slideshow)
            )

            return binding.root
        }
}