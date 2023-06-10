package com.kotlinit.devfeedrestautantapp

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainCoursesActivity : AppCompatActivity() {
    private lateinit var mainCoursesListView: ListView

    //    create 20 unique main course objects
    val mainCourses = listOf(
        Dish(
            "Steak",
            "Steak with chips and a side salad",
            10.50,
            R.drawable.steak
        ),
        Dish(
            "Fish and Chips",
            "Fish and chips with mushy peas",
            9.50,
            R.drawable.fish_and_chips
        ),
        Dish(
            "Chicken Curry",
            "Chicken curry with rice and naan bread",
            8.50,
            R.drawable.chicken_curry
        ),
        Dish(
            "Beef Burger",
            "Beef burger with chips and a side salad",
            7.50,
            R.drawable.beef_burger
        ),
        Dish(
            "Lasagne",
            "Lasagne with chips and a side salad",
            8.50,
            R.drawable.lasagna
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_courses)

        mainCoursesListView = findViewById(R.id.list_view_mains)

        val mainsAdapter = DishAdapter(this, R.layout.list_view_item, mainCourses)
        mainCoursesListView.adapter = mainsAdapter
    }

    companion object {
        fun getStartIntent(mainActivity: MainActivity): Intent {
            return Intent(mainActivity, StartersActivity::class.java)
        }
    }


}
