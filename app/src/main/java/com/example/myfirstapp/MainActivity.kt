package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val firstText = findViewById<TextView>(R.id.textView)
        val resetButton = findViewById<Button>(R.id.button2)
        var number = 0

        btnClickMe.setOnClickListener {
            number += 1
            firstText.text = number.toString()
        }

        resetButton.setOnClickListener {
            number = 0
            firstText.text = number.toString()

        }

    }
}