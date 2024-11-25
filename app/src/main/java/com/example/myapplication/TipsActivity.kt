package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)


        val sportType = intent.getStringExtra("SPORT_TYPE")


        val tipsTextView = findViewById<TextView>(R.id.textView_tips)


        when (sportType) {
            "volleyball" -> tipsTextView.text = getString(R.string.volleyball_tips)
            "football" -> tipsTextView.text = getString(R.string.football_tips)
            "basketball" -> tipsTextView.text = getString(R.string.basketball_tips)
            "fencing" -> tipsTextView.text = getString(R.string.fencing_tips)
            "belly_dance" -> tipsTextView.text = getString(R.string.belly_dance_tips)
            "badminton" -> tipsTextView.text = getString(R.string.badminton_tips)
            "table_tennis" -> tipsTextView.text = getString(R.string.table_tennis_tips)
            "boxing" -> tipsTextView.text = getString(R.string.boxing_tips)
            "pilates" -> tipsTextView.text = getString(R.string.pilates_tips)
            "aerobics" -> tipsTextView.text = getString(R.string.aerobics_tips)

            "volleyball_food" -> tipsTextView.text = getString(R.string.volleyball_food_tips)
            "football_food" -> tipsTextView.text = getString(R.string.football_food_tips)
            "basketball_food" -> tipsTextView.text = getString(R.string.basketball_food_tips)
            "fencing_food" -> tipsTextView.text = getString(R.string.fencing_food_tips)
            "belly_dance_food" -> tipsTextView.text = getString(R.string.belly_dance_food_tips)
            "badminton_food" -> tipsTextView.text = getString(R.string.badminton_food_tips)
            "table_tennis_food" -> tipsTextView.text = getString(R.string.table_tennis_food_tips)
            "boxing_food" -> tipsTextView.text = getString(R.string.boxing_food_tips)
            "pilates_food" -> tipsTextView.text = getString(R.string.pilates_food_tips)
            "aerobics_food" -> tipsTextView.text = getString(R.string.aerobics_food_tips)

            "volleyball_section" -> tipsTextView.text = getString(R.string.volleyball_section)
            "football_section" -> tipsTextView.text = getString(R.string.football_section)
            "basketball_section" -> tipsTextView.text = getString(R.string.basketball_section)
            "fencing_section" -> tipsTextView.text = getString(R.string.fencing_section)
            "belly_dance_section" -> tipsTextView.text = getString(R.string.belly_section)
            "badminton_section" -> tipsTextView.text = getString(R.string.badminton_section)
            "table_tennis_section" -> tipsTextView.text = getString(R.string.table_tennis_section)
            "boxing_section" -> tipsTextView.text = getString(R.string.boxing_section)
            "pilates_section" -> tipsTextView.text = getString(R.string.pilates_section)
            "aerobics_section" -> tipsTextView.text = getString(R.string.aerobics_section)

            else -> tipsTextView.text = "Памятка отсутствует"
        }
    }
}
