package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etLogIn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            validateRegistration()
        }
    }

    private fun validateRegistration() {
        var formsError = false
        val firstName = binding.etFirstname.text.toString()
        if (firstName.isBlank()) {
            formsError = true
            binding.tilFirstName.error = "First name required"
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()) {
            formsError = true
            binding.tilLastName.error = "Last name is required"
        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formsError = true
            binding.tilEmail.error = " Your email is required"
        }
        val userName=binding.etUserName.text.toString()
        if(userName.isBlank()){
            binding.tilUsername2.error="create username"
        }
        val password = binding.etCreatepassword.text.toString()
        if (password.isBlank()) {
            formsError = true
            binding.tilCreatePassword.error = "Password is required"
        }
        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()) {
            formsError = true
            binding.tilConfirmPassword.error = "Confirm password is required"
        }
        if (password != confirmPassword) {
            formsError = true
            binding.tilConfirmPassword.error = "Passwords do not match"
        }
        if (!formsError) {
            performRegistration(firstName, lastName, email, password)
        }
    }

    private fun performRegistration(firstName: String, lastName: String, email: String, password: String) {
        // Perform registration logic here
        // For demonstration, we'll just navigate to MainActivity
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        clearErrors() // Clear errors after successful navigation
    }

    private fun clearErrors() {
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCreatePassword.error = null
        binding.tilConfirmPassword.error = null
    }
}
