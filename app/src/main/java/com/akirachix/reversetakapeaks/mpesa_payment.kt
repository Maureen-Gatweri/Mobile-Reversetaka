package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityMpesaPaymentBinding

class mpesa_payment : AppCompatActivity() {
    lateinit var binding: ActivityMpesaPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMpesaPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPal.setOnClickListener {
            val intent=Intent(this,confirm_payment::class.java)
            startActivity(intent)
        }
    }
}