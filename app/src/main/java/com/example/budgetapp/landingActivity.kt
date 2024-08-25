package com.example.budgetapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.example.budgetapp.databinding.ActivityLandingBinding
import com.example.budgetapp.databinding.ActivityMainBinding

class landingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpBt.setOnClickListener {
            val intent = Intent(this, signUpActivity::class.java)
            startActivity(intent)
        }

        binding.loginBt.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }


        //set the status bar to transparent
        WindowCompat.setDecorFitsSystemWindows(
            window,
            false
        )
    }
}