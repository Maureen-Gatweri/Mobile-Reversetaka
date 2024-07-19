package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityRewardSystemBinding

class reward_system : AppCompatActivity() {
    lateinit var binding: ActivityRewardSystemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityRewardSystemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRedeem.setOnClickListener{
            val intent = Intent(this, organisations::class.java)
            startActivity(intent)
        }
    }
}