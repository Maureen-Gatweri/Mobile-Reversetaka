package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityCancedcartBinding

class cancedcart : AppCompatActivity() {
    var count =0
    lateinit var binding: ActivityCancedcartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCancedcartBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.btnadd.setOnClickListener {
            count ++
            binding.btnone.text= count.toString()
        }
        binding.btnsubtract.setOnClickListener {
            if (count>1)
                count --
            binding.btnone.text = count.toString()
        }
        binding.imageView3.setOnClickListener {
            val intent= Intent(this,HumbergerActivity::class.java)
            startActivity(intent)

        }
        binding.imageView4.setOnClickListener {
            val intent = Intent(this,cart::class.java)
            startActivity(intent)
        }


    }
}