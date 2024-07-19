package com.akirachix.reversetakapeaks

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.reversetakapeaks.databinding.ShopListItemBinding
import com.squareup.picasso.Picasso

class ShopAdapter(var shopList: List<Shop>):
    RecyclerView.Adapter<ShopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val binding = ShopListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ShopViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return shopList.size
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val profile = shopList[position]
        holder.binding.idname.text = profile.name
        holder.binding.idPrice.text = profile.price

        Picasso.get()
            .load(profile.image1)
            .placeholder(R.drawable.linen_clothe)
            .into(holder.binding.idImage)

        holder.binding.idImage.setOnClickListener {
            val intent = Intent(holder.itemView.context, DescriptionActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
        holder.binding.tvAddtocart1.setOnClickListener {
            val intent = Intent(holder.itemView.context, cart::class.java)
            holder.itemView.context.startActivity(intent)
        }


    }

}


class ShopViewHolder(var binding: ShopListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {


    }