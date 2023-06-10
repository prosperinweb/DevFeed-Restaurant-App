package com.kotlinit.devfeedrestautantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.kotlinit.devfeedrestautantapp.databinding.ActivityDessertsBinding
import com.kotlinit.devfeedrestautantapp.databinding.ActivityStartersBinding


class StartersActivity : AppCompatActivity() {
    private lateinit var startersListView: ListView

    //    create 20 unique starter objects
    val starters = listOf(
        Dish(
            "Chicken Wings",
            "Chicken wings with a spicy sauce",
            4.50,
            R.drawable.chicken_wings
        ),
        Dish(
            "Garlic Bread",
            "Garlic bread with mozzarella cheese",
            3.50,
            R.drawable.garlic_bread
        ),
        Dish(
            "Bruschetta",
            "Toasted bread with tomatoes, garlic and basil",
            3.50,
            R.drawable.bruschetta
        ),
        Dish("Calamari", "Fried squid with a garlic mayonnaise", 4.50, R.drawable.calamari),
        Dish(
            "Soup of the Day",
            "Ask your waiter for today's soup",
            3.50,
            R.drawable.soup_of_the_day
        ),
        Dish(
            "Prawn Cocktail",
            "Prawns with a seafood sauce",
            4.50,
            R.drawable.prawn_cocktail
        ),
        Dish(
            "Mozzarella Sticks",
            "Deep fried mozzarella sticks with a tomato dip",
            3.50,
            R.drawable.mozzarella_sticks
        ),
        Dish(
            "Garlic Mushrooms",
            "Mushrooms in a garlic sauce",
            3.50,
            R.drawable.garlic_mushrooms
        ),
        Dish(
            "Nachos",
            "Nachos with salsa, guacamole and sour cream",
            3.50,
            R.drawable.nachos
        ),
        Dish("Olives", "Olives with a garlic bread", 3.50, R.drawable.olives),
        Dish(
            "Onion Rings",
            "Deep fried onion rings with a garlic dip",
            3.50,
            R.drawable.onion_rings
        ),
        Dish("Pate", "Pate with toast and a red onion chutney", 3.50, R.drawable.pate),
    )


    private lateinit var binding: ActivityStartersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val starterAdapter = DishAdapter(this, R.layout.list_view_item, starters)
        startersListView.adapter = starterAdapter
    }


}