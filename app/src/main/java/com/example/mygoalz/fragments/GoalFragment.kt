package com.example.mygoalz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoalz.R
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.databinding.FragmentGoalBinding

class GoalFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentGoalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGoalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }

    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.floatingActionButton.setOnClickListener {
            navControl.navigate(R.id.action_goalFragment_to_homeFragment)
        }
        binding.AddHabit.setOnClickListener {
            navControl.navigate(R.id.action_goalFragment_to_habitCreationFragment)
        }
        binding.AddTask.setOnClickListener {
            navControl.navigate(R.id.action_goalFragment_to_createTaskFragment)
        }

    }

}