package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.reversetakapeaks.databinding.ActivityCartBinding

class cart : AppCompatActivity() {
    var count =0
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            count++
            binding.btn1.text = count.toString()
        }
        binding.btnminus.setOnClickListener {
            if (count > 1)
                count--
            binding.btn1.text = count.toString()

        }
        binding.btnplus2.setOnClickListener {
            count++
            binding.btn2.text=count.toString()
        }
        binding.btnminus2.setOnClickListener {
            if (count>1)
                count--
            binding.btn2.text=count.toString()
        }
        binding.tvcancel1.setOnClickListener {

            val intent= Intent(this,cancedcart::class.java)
            startActivity(intent)

        }
        binding.tvmenu.setOnClickListener {
            val intent= Intent(this,HumbergerActivity::class.java)
            startActivity(intent)
        }
        binding.tvcheckout.setOnClickListener{
            val  intent=Intent(this,select_payment::class.java)
            startActivity(intent)
        }
    }
}
