package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPayments.setOnClickListener {
            val intent =Intent(this,LandingPage::class.java)
            startActivity(intent)
            validateRegistration()
        }
        binding.etSignIn.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }


   fun validateRegistration(): Boolean {
        clearErrors()
        var formErrors = false
        val username = binding.etUsername.text.toString()
        if (username.isBlank()) {
            binding.tilUsername.error = "UserName is required"
            formErrors = true
        } else {
            binding.tilUsername.error = null
        }

        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            binding.tilCreatePassword.error = "Password is required"
            formErrors = true
        } else {
            binding.tilCreatePassword.error = null
        }

        return !formErrors
    }

    fun clearErrors() {
        binding.tilUsername.error = null
        binding.tilCreatePassword.error = null
    }
}





