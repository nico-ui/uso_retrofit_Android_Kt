package com.example.retrofit_dogapi_2

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.retrofit_dogapi_2.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image: String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}