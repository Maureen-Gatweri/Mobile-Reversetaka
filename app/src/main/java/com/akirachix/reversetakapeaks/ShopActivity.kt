package com.akirachix.reversetakapeaks

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.akirachix.reversetakapeaks.databinding.ActivityShopBinding

class ShopActivity : AppCompatActivity() {
    lateinit var binding: ActivityShopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvShop.layoutManager = GridLayoutManager(this, 2)
        listOfShop()

        binding.idMenu.setOnClickListener {
            val intent = Intent(this, HumbergerActivity::class.java)
            startActivity(intent)
        }



    }


    fun listOfShop() {
        val shopOne = Shop("Denim","200 $","https://i.pinimg.com/474x/d6/2f/43/d62f43b815b4a51cd62de554cac4ea1e.jpg")
        val shopTwo = Shop("CropTop","200$","https://i.pinimg.com/474x/12/8a/b7/128ab79ec21870404debb04623d9597f.jpg")
        val shopThree = Shop("Longere","200$","https://i.pinimg.com/474x/cb/39/22/cb39223a5a04157de0cd2ed3e7c8114d.jpg")
        val shopFour = Shop("Mini-Skirt","200$","https://i.pinimg.com/474x/c2/e2/fd/c2e2fd67d365b27ba850c02d7d535525.jpg")
        val shopFive = Shop("Jacket","200$","https://i.pinimg.com/474x/22/21/03/222103dbff19bb11e0d740d762b15c35.jpg")
        val shopSix = Shop("JumSuit","200 $","https://i.pinimg.com/474x/f3/d7/82/f3d78241ed966733cdea104e29a6d8f0.jpg")
        val shopSeven = Shop("OffShoulder","200$","https://i.pinimg.com/474x/ad/66/37/ad663752304c12c7e4e06f11ae57e96d.jpg")
        val shopEight = Shop("Coset","200$","https://i.pinimg.com/474x/c0/e3/a1/c0e3a17268cf1b1d69b896d127ee9f93.jpg")
        val shopNine = Shop("Maxi-dress","200$","https://i.pinimg.com/474x/41/d9/56/41d956a8f26d1ebc5fd6c2659190b59b.jpg")
        val shopTen = Shop("LaetherJk","200$","https://i.pinimg.com/474x/6d/48/23/6d48234722855c4bd579e3fc51dc5a94.jpg")
        val shopEleven = Shop("HighLow","200 $","https://i.pinimg.com/474x/d1/c1/bd/d1c1bd43b94cf05393387c289215485d.jpg")
        val shopTwelve = Shop("Pallazo","200$","https://i.pinimg.com/474x/c1/c0/a3/c1c0a3cf06f7cde08082ffc73d24cae5.jpg")
        val shopThirteen = Shop("BotyShorts","200$","https://i.pinimg.com/474x/f9/ec/00/f9ec0093a5c8f0f069f0c5beca10a9a4.jpg")
        val shopFourteen = Shop("CargPants","200$","https://i.pinimg.com/474x/f9/97/1f/f9971fd624a05f95ee9eb90d4a734ecc.jpg")
        val shopFifteen = Shop("Dior","200$","https://i.pinimg.com/474x/78/1a/e9/781ae90c9bda1b886540efa49fe8907e.jpg")
        val shopSixteen = Shop("Chanel","200$","https://i.pinimg.com/474x/02/c6/64/02c6645a8e7adee82990f833529e4bc0.jpg")


        val myProfiles = listOf(
            shopOne,shopTwo,shopThree,shopFour,shopFive,
            shopSix,shopSeven,shopEight,shopNine,shopTen,shopEleven,
            shopTwelve,shopThirteen,shopFourteen,shopFifteen,shopSixteen
        )
        val shopAdapter = ShopAdapter(myProfiles)
        binding.rvShop.adapter = shopAdapter
    }
}