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
import com.example.budgetapp.databinding.ActivitySignUpBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore

class landingActivity : AppCompatActivity() {

    private lateinit var Auth : FirebaseAuth
    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var binding : ActivityLandingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Auth = Firebase.auth
        firebaseAuth = FirebaseAuth.getInstance()
        val db = FirebaseFirestore.getInstance()

        binding.signUpBt.setOnClickListener {
            val intent = Intent(this, signUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.loginBt.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
            finish()
        }


        //set the status bar to transparent
        WindowCompat.setDecorFitsSystemWindows(
            window,
            false
        )
    }
}