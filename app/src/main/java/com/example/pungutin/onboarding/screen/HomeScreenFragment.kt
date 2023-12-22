package com.example.pungutin.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import com.example.pungutin.R
import com.example.pungutin.databinding.FragmentHomeScreenBinding


class HomeScreenFragment : Fragment() {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home_screen, container, false)
        binding = FragmentHomeScreenBinding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtHome.setOnClickListener {
            Toast.makeText(context, "Ini Home", Toast.LENGTH_SHORT).show()
        }
        return view
    }


}