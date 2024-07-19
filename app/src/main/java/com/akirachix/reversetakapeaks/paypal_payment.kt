package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityPaypalPaymentBinding

class paypal_payment : AppCompatActivity() {
    lateinit var binding: ActivityPaypalPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityPaypalPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkoutMpesa.setOnClickListener{
            if (validateRegistration()) {
                val intent= Intent(this,confirm_payment::class.java)
                startActivity(intent)
            }
        }
    }

    fun validateRegistration(): Boolean {
        clearForms()
        val phoneNumber= binding.etPhoneNumber.text.toString()
        return if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error="Phone number is required"
            false
        } else {
            true
        }
    }

    fun clearForms(){
        binding.tilPhoneNumber.error=null
    }
}