package com.example.mygoalz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoalz.R
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }

    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.AddGoalButton.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_createGoalFragment)
        }
        binding.FirstGoalProfile.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_goalFragment)
        }
        binding.SecondGoalProfile.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_goalFragment)
        }
        binding.MyProfile.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_profileFragment2)
        }
        binding.Settings.setOnClickListener {
            navControl.navigate(R.id.action_homeFragment_to_settingsFragment)
        }
    }


}