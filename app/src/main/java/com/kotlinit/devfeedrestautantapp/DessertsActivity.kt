package com.kotlinit.devfeedrestautantapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlinit.devfeedrestautantapp.databinding.ActivityDessertsBinding

class DessertsActivity : AppCompatActivity() {

    // create 5 unique dessert objects
    private val desserts = listOf(
        Dish(
            "Chocolate Cake",
            "Chocolate cake with a chocolate sauce",
            3.50,
            R.drawable.chocolate_cake
        ),
        Dish(
            "Cheesecake",
            "Cheesecake with a strawberry sauce",
            3.50,
            R.drawable.cheese_cake
        ),
        Dish(
            "Ice Cream",
            "Vanilla ice cream with a chocolate sauce",
            3.50,
            R.drawable.ice_cream
        ),
        Dish(
            "Chocolate Brownie",
            "Chocolate brownie with a chocolate sauce",
            3.50,
            R.drawable.chocolate_brownie
        ),
        Dish(
            "Sticky Toffee Pudding",
            "Sticky toffee pudding with a toffee sauce",
            3.50,
            R.drawable.toffee_pudding
        )
    )

    private lateinit var binding: ActivityDessertsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDessertsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dessertsAdapter = DishAdapter(this, R.layout.list_view_item, desserts)
        binding.listViewDesserts.adapter = dessertsAdapter
    }
}
