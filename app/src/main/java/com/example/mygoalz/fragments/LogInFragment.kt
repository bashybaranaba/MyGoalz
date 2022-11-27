package com.example.mygoalz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.R
import com.example.mygoalz.databinding.FragmentLogInBinding


class LogInFragment : Fragment() {
    private lateinit var navControl: NavController
    private lateinit var binding: FragmentLogInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }


    private fun init(view:View) {
        navControl = Navigation.findNavController(view)
        binding.signIn.setOnClickListener {
            Toast.makeText(context, "Logged in successfully", Toast.LENGTH_SHORT).show()
            navControl.navigate(R.id.action_logInFragment_to_homeFragment)
        }
        binding.textSignUp.setOnClickListener {
            navControl.navigate(R.id.action_logInFragment_to_signUpFragment)
        }
    }
}