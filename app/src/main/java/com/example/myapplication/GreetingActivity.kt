package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val firstName = intent.getStringExtra("userName") ?: "Пользователь"

        val greetingTextView = findViewById<TextView>(R.id.textViewGreeting)
        greetingTextView.text = "Добрый день, $firstName"


        thread {

            Thread.sleep(3000)


            val intent = Intent(this@GreetingActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
