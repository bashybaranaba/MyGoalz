package com.example.mygoalz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mygoalz.R
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.databinding.FragmentHabitCreationBinding

class HabitCreationFragment : Fragment() {

    private lateinit var navControl: NavController
    private lateinit var binding: FragmentHabitCreationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHabitCreationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }

    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.floatingActionButton.setOnClickListener {
            navControl.navigate(R.id.action_habitCreationFragment_to_goalFragment)
        }

    }

}