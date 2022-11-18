package com.example.mygoalz.fragments

import android.content.Intent
import android.os.Bundle

import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mygoalz.R
import com.example.mygoalz.databinding.FragmentSignUpBinding
import android.os.Handler
import com.example.mygoalz.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private lateinit var navControl: NavController
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
        
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }


    private fun init(view: View) {
        navControl = Navigation.findNavController(view)
        navControl.navigate(R.id.action_splashFragment_to_signUpFragment3)

    }
}
