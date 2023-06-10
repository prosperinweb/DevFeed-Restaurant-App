package com.kotlinit.devfeedrestautantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.kotlinit.devfeedrestautantapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cardViewActions = mapOf(
            binding.cardViewStarters to StartersActivity::class.java,
            binding.cardViewMains to MainCoursesActivity::class.java,
            binding.cardViewDesserts to DessertsActivity::class.java
        )

        cardViewActions.forEach { (cardView, activity) ->
            cardView.setOnClickListener {
                startActivity(Intent(this, activity))
            }
        }
    }
}
