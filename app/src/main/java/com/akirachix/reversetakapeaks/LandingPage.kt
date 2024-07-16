package com.akirachix.reversetakapeaks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding: ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityLandingPageBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }


}


