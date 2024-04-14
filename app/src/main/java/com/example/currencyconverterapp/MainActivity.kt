package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edt: EditText = findViewById(R.id.edt)
        val btnRupees: Button = findViewById(R.id.btn_rupees)
        val btnDollar: Button = findViewById(R.id.btn_dollar)
        val convertedText: TextView = findViewById(R.id.tv)

        btnRupees.setOnClickListener{
            val amount = edt.text.toString().toInt()
            val rupeeAmount = 80*amount
            convertedText.text = "Converted Amount : $rupeeAmount"
        }

        btnDollar.setOnClickListener{
            val amount = edt.text.toString().toInt()
            val dollarAmount = amount/80
            convertedText.text = "Converted Amount : $dollarAmount"
        }
    }
}