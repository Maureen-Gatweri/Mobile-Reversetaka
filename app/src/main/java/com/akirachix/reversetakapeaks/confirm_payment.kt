package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityConfirmPaymentBinding

class confirm_payment : AppCompatActivity() {
    lateinit var binding: ActivityConfirmPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReedem.setOnClickListener{
            val intent = Intent(this, reward_system::class.java)
            startActivity(intent)
        }

    }
}