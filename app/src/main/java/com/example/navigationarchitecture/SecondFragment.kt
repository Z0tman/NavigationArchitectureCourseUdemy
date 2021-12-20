package com.example.navigationarchitecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationarchitecture.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding : FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second,container, false)

        var input : String? = requireArguments().getString("userInput")
        binding.textView.text = input.toString()

        //return inflater.inflate(R.layout.fragment_second, container, false)
        return binding.root
    }

}