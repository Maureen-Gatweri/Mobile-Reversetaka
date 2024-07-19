package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivitySelectPaymentBinding

class select_payment : AppCompatActivity() {
    var isCheckboxSelected=false
    lateinit var binding: ActivitySelectPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySelectPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkPayPal.setOnClickListener{
            val intent= Intent(this,mpesa_payment::class.java)
            startActivity(intent)
        }
        binding.checkMpesa.setOnClickListener{
            val intent= Intent(this,paypal_payment::class.java)
            startActivity(intent)

        }

        binding.checkMpesa.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.checkPayPal.isChecked = false
                isCheckboxSelected = true
            } else {
                isCheckboxSelected = false
            }
        }

        binding.checkPayPal.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.checkMpesa.isChecked = false
                isCheckboxSelected = true
            } else {
                isCheckboxSelected = false
            }
        }

    }
}