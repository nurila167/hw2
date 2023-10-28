package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView
    var nameView: TextView
    var priceView: TextView

    init {
        imageView = itemView.findViewById<ImageView>(R.id.photoImageView)
        nameView = itemView.findViewById<TextView>(R.id.burgerNameText)
        priceView = itemView.findViewById<TextView>(R.id.priceTextView)
    }
}
