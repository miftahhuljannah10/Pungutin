package com.example.pungutin.onboarding.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.pungutin.R
import com.example.pungutin.databinding.FragmentThirdScreenBinding


class ThirdScreenFragment : Fragment() {
    private lateinit var binding: FragmentThirdScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(inflater, container,false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeScreenFragment)
            onBoardingFinised()
        }
        return binding.root
    }
    private fun onBoardingFinised(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }


}