package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecommendationsFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendations_food)

        // Кнопка для волейбола
        val volleyballButton = findViewById<Button>(R.id.buttonfood_volleyball)
        volleyballButton.setOnClickListener {
            openTipsActivity("volleyball_food")
        }

        // Кнопка для мини-футбола
        val footballButton = findViewById<Button>(R.id.buttonfood_football)
        footballButton.setOnClickListener {
            openTipsActivity("football_food")
        }

        // Кнопка для баскетбола
        val basketballButton = findViewById<Button>(R.id.buttonfood_basketball)
        basketballButton.setOnClickListener {
            openTipsActivity("basketball_food")
        }

        // Кнопка для танца живота
        val bellyDanceButton = findViewById<Button>(R.id.buttonfood_belly_dance)
        bellyDanceButton.setOnClickListener {
            openTipsActivity("belly_dance_food")
        }

        // Кнопка для фехтования
        val fencingButton = findViewById<Button>(R.id.buttonfood_fencing)
        fencingButton.setOnClickListener {
            openTipsActivity("fencing_food")
        }

        // Кнопка для бадминтона
        val badmintonButton = findViewById<Button>(R.id.buttonfood_badminton)
        badmintonButton.setOnClickListener {
            openTipsActivity("badminton_food")
        }

        // Кнопка для настольного тенниса
        val tableTennisButton = findViewById<Button>(R.id.buttonfood_table_tennis)
        tableTennisButton.setOnClickListener {
            openTipsActivity("table_tennis_food")
        }

        // Кнопка для бокса
        val boxingButton = findViewById<Button>(R.id.buttonfood_boxing)
        boxingButton.setOnClickListener {
            openTipsActivity("boxing_food")
        }

        // Кнопка для пилатеса
        val pilatesButton = findViewById<Button>(R.id.buttonfood_pilates)
        pilatesButton.setOnClickListener {
            openTipsActivity("pilates_food")
        }

        // Кнопка для аэробики
        val aerobicsButton = findViewById<Button>(R.id.buttonfood_aerobics)
        aerobicsButton.setOnClickListener {
            openTipsActivity("aerobics_food")
        }
    }

    // Функция для открытия TipsActivity с передачей типа спорта
    private fun openTipsActivity(sportType: String) {
        val intent = Intent(this, TipsActivity::class.java)
        intent.putExtra("SPORT_TYPE", sportType)  // Передаем тип спорта через Intent
        startActivity(intent)
    }
}
