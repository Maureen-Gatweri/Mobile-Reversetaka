package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityPointsBinding

class points : AppCompatActivity() {
    lateinit var binding: ActivityPointsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPointsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener{
            if (validateRegistration()) {
                val intent = Intent(this, pointsconfirmation::class.java)
                startActivity(intent)
            }
        }
        binding.btnContinue.setOnClickListener{
            validateRegistration()
            val intent = Intent(this, pointsconfirmation::class.java)
            startActivity(intent)
        }
        binding.btnCancel.setOnClickListener{
            finish()
        }

    }
    fun validateRegistration() : Boolean{
        clearForms()
        val btnContinue = binding.etPoints.text.toString()
        return if (btnContinue.isBlank()){
            binding.tilPoints.error = "Number of points is required"
            false
        }
        else{
            true
        }
    }

    fun clearForms(){
        binding.tilPoints.error = null
    }
}