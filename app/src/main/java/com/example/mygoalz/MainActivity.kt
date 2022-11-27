package com.example.mygoalz


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mygoalz.databinding.ActivityMainBinding
import com.example.mygoalz.fragments.CreateTaskFragmentFragment
import com.example.mygoalz.fragments.EditProfile
import com.example.mygoalz.fragments.GoalFragment
import com.example.mygoalz.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.myTasks -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.myGoals -> {
                    replaceFragment(GoalFragment())
                    true
                }
                R.id.profile -> {
                    replaceFragment(EditProfile())
                    true
                }
                R.id.newTask -> {
                    replaceFragment(CreateTaskFragmentFragment())
                    true
                }
                R.id.search -> {
                    replaceFragment(HomeFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}