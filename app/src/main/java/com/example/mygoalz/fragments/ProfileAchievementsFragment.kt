package com.example.mygoalz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoalz.R
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.databinding.FragmentProfileAchievementsBinding


class ProfileAchievementsFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentProfileAchievementsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileAchievementsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }

    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.SettingsIconAch.setOnClickListener {
            navControl.navigate(R.id.action_profileAchievementsFragment_to_settingsFragment)
        }
        binding.GoalsProfileAch.setOnClickListener {
            navControl.navigate(R.id.action_profileAchievementsFragment_to_profileFragment)
        }
        binding.FirstGoalProfileAch.setOnClickListener {
            navControl.navigate(R.id.action_profileAchievementsFragment_to_achievementFragment)
        }
        binding.SecondGoalProfileAch.setOnClickListener {
            navControl.navigate(R.id.action_profileAchievementsFragment_to_achievementFragment)
        }
    }


}