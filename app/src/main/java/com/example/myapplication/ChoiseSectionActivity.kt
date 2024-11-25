package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChoiseSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choise_section)

        // Кнопка для волейбола
        val volleyballButton = findViewById<Button>(R.id.button_volleyball_section)
        volleyballButton.setOnClickListener {
            openTipsActivity("volleyball_section")
        }

        // Кнопка для мини-футбола
        val footballButton = findViewById<Button>(R.id.button_football_section)
        footballButton.setOnClickListener {
            openTipsActivity("football_section")
        }

        // Кнопка для баскетбола
        val basketballButton = findViewById<Button>(R.id.button_basketball_section)
        basketballButton.setOnClickListener {
            openTipsActivity("basketball_section")
        }

        // Кнопка для танца живота
        val bellyDanceButton = findViewById<Button>(R.id.button_belly_dance_section)
        bellyDanceButton.setOnClickListener {
            openTipsActivity("belly_dance_section")
        }

        // Кнопка для фехтования
        val fencingButton = findViewById<Button>(R.id.button_fencing_section)
        fencingButton.setOnClickListener {
            openTipsActivity("fencing_food_section")
        }

        // Кнопка для бадминтона
        val badmintonButton = findViewById<Button>(R.id.button_badminton_section)
        badmintonButton.setOnClickListener {
            openTipsActivity("badminton_section")
        }

        // Кнопка для настольного тенниса
        val tableTennisButton = findViewById<Button>(R.id.button_table_tennis_section)
        tableTennisButton.setOnClickListener {
            openTipsActivity("table_tennis_section")
        }

        // Кнопка для бокса
        val boxingButton = findViewById<Button>(R.id.button_boxing_section)
        boxingButton.setOnClickListener {
            openTipsActivity("boxing_section")
        }

        // Кнопка для пилатеса
        val pilatesButton = findViewById<Button>(R.id.button_pilates_section)
        pilatesButton.setOnClickListener {
            openTipsActivity("pilates_section")
        }

        // Кнопка для аэробики
        val aerobicsButton = findViewById<Button>(R.id.button_aerobics_section)
        aerobicsButton.setOnClickListener {
            openTipsActivity("aerobics_section")
        }
    }

    // Функция для открытия TipsActivity с передачей типа спорта
    private fun openTipsActivity(sportType: String) {
        val intent = Intent(this, TipsActivity::class.java)
        intent.putExtra("SPORT_TYPE", sportType)  // Передаем тип спорта через Intent
        startActivity(intent)
    }
}
