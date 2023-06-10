package com.kotlinit.devfeedrestautantapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        binding.textViewContactEmail.setOnClickListener { view ->
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:devfeed@kotlinit.com")
            }

            if (intent.resolveActivity(view.context.packageManager) != null) {
                view.context.startActivity(intent)
            } else {
                Toast.makeText(view.context, "No email client found", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
