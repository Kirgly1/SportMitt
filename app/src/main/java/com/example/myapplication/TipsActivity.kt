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
            else -> tipsTextView.text = "Памятка отсутствует"
        }
    }
}
