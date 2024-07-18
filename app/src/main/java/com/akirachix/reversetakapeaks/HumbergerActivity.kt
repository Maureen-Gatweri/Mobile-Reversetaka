package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityHumbergerBinding

class HumbergerActivity : AppCompatActivity() {
    lateinit var binding: ActivityHumbergerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHumbergerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idDelete.setOnClickListener {
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }
            binding.tvHome.setOnClickListener {
                val intent = Intent(this, ShopActivity::class.java)
                startActivity(intent)
            }

    }
}