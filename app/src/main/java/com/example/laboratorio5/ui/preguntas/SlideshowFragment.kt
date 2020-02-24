package com.example.laboratorio5.ui.preguntas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.laboratorio5.R
import com.example.laboratorio5.databinding.FragmentHomeBinding
import com.example.laboratorio5.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSlideshowBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_slideshow, container, false
        )

        binding.siguiente.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_slideshow_to_nav_tools)
        )
        return binding.root
    }
}