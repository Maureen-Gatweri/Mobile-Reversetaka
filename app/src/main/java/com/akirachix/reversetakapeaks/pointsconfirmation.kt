package com.akirachix.reversetakapeaks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityPointsconfirmationBinding

class pointsconfirmation : AppCompatActivity() {
    lateinit var binding: ActivityPointsconfirmationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPointsconfirmationBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_pointsconfirmation)

    }
}