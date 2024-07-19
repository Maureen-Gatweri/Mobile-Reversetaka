package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityOrganisationsBinding

class organisations : AppCompatActivity() {
    lateinit var binding: ActivityOrganisationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrganisationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding = ActivityOrganisationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivOrg1.setOnClickListener{
            val intent = Intent(this, points::class.java)
            startActivity(intent)
        }
        binding.ivOrg2.setOnClickListener{
            val intent = Intent(this, points::class.java)
            startActivity(intent)
        }
        binding.ivOrg3.setOnClickListener{
            val intent = Intent(this, points::class.java)
            startActivity(intent)
        }
        binding.ivOrg4.setOnClickListener{
            val intent = Intent(this, points::class.java)
            startActivity(intent)
        }


    }
}