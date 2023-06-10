package com.kotlinit.devfeedrestautantapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DishAdapter(context: Context, private val resource: Int, private val items: List<Dish>)
    : ArrayAdapter<Dish>(context, resource, items) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = convertView ?: inflater.inflate(resource, null)

        val dish = items[position]

        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val descTextView: TextView = view.findViewById(R.id.descTextView)
        val priceTextView: TextView = view.findViewById(R.id.priceTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        nameTextView.text = dish.name
        descTextView.text = dish.description
        priceTextView.text = "$${String.format("%.2f", dish.price)}"
        imageView.setImageResource(dish.imageResource)

        return view
    }
}