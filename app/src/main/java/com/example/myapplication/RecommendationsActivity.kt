package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecommendationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendations)

        // Кнопка для волейбола
        val volleyballButton = findViewById<Button>(R.id.button_volleyball)
        volleyballButton.setOnClickListener {
            openTipsActivity("volleyball")
        }

        // Кнопка для мини-футбола
        val footballButton = findViewById<Button>(R.id.button_football)
        footballButton.setOnClickListener {
            openTipsActivity("football")
        }

        // Кнопка для баскетбола
        val basketballButton = findViewById<Button>(R.id.button_basketball)
        basketballButton.setOnClickListener {
            openTipsActivity("basketball")
        }

        // Кнопка для танца живота
        val bellyDanceButton = findViewById<Button>(R.id.button_belly_dance)
        bellyDanceButton.setOnClickListener {
            openTipsActivity("belly_dance")
        }

        // Кнопка для фехтования
        val fencingButton = findViewById<Button>(R.id.button_fencing)
        fencingButton.setOnClickListener {
            openTipsActivity("fencing")
        }

        // Кнопка для бадминтона
        val badmintonButton = findViewById<Button>(R.id.button_badminton)
        badmintonButton.setOnClickListener {
            openTipsActivity("badminton")
        }

        // Кнопка для настольного тенниса
        val tableTennisButton = findViewById<Button>(R.id.button_table_tennis)
        tableTennisButton.setOnClickListener {
            openTipsActivity("table_tennis")
        }

        // Кнопка для бокса
        val boxingButton = findViewById<Button>(R.id.button_boxing)
        boxingButton.setOnClickListener {
            openTipsActivity("boxing")
        }

        // Кнопка для пилатеса
        val pilatesButton = findViewById<Button>(R.id.button_pilates)
        pilatesButton.setOnClickListener {
            openTipsActivity("pilates")
        }

        // Кнопка для аэробики
        val aerobicsButton = findViewById<Button>(R.id.button_aerobics)
        aerobicsButton.setOnClickListener {
            openTipsActivity("aerobics")
        }
    }

    // Функция для открытия TipsActivity с передачей типа спорта
    private fun openTipsActivity(sportType: String) {
        val intent = Intent(this, TipsActivity::class.java)
        intent.putExtra("SPORT_TYPE", sportType)  // Передаем тип спорта через Intent
        startActivity(intent)
    }
}
