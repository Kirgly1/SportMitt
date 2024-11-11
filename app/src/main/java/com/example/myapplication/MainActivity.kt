package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val chooseSectionButton = findViewById<Button>(R.id.button_choose_section)
        val statisticsButton = findViewById<Button>(R.id.button_statistics)
        val scheduleButton = findViewById<Button>(R.id.button_schedule)
        val recommendationsButton = findViewById<Button>(R.id.button_recommendations)
        val contactTrainerButton = findViewById<Button>(R.id.button_contact_trainer)
        val foodRecommendationsButton = findViewById<Button>(R.id.button_food_recommendations)
        val contactsButton = findViewById<Button>(R.id.button_contacts)


        chooseSectionButton.setOnClickListener {

        }

        statisticsButton.setOnClickListener {
            // Действие при нажатии на "Статистика посещений"
        }

        scheduleButton.setOnClickListener {

        }

        recommendationsButton.setOnClickListener {

            val intent = Intent(this, RecommendationsActivity::class.java)
            startActivity(intent)
        }

        contactTrainerButton.setOnClickListener {

        }

        foodRecommendationsButton.setOnClickListener {

        }
        contactsButton.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
