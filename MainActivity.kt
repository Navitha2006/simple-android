package com.example.randomnumber

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etStart = findViewById<EditText>(R.id.etStart)
        val etEnd = findViewById<EditText>(R.id.etEnd)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnGenerate.setOnClickListener {
            val startText = etStart.text.toString()
            val endText = etEnd.text.toString()

            if (startText.isEmpty() || endText.isEmpty()) {
                Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val start = startText.toInt()
            val end = endText.toInt()

            if (start > end) {
                Toast.makeText(this, "Start should be less than End", Toast.LENGTH_SHORT).show()
            } else {
                val randomNumber = Random.nextInt(start, end + 1)
                tvResult.text = "Random Number: $randomNumber"
            }
        }
    }
}
