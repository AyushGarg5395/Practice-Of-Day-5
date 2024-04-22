package com.example.day6learningandroidstudiowithkotlinphilliplackner

import android.os.Bundle
import android.util.Log
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etSecondName = findViewById<EditText>(R.id.etSecondName)
        val etBirthDate = findViewById<EditText>(R.id.etBirthDate)
        val etCountry = findViewById<EditText>(R.id.etCountry)
        val btnApply = findViewById<Button>(R.id.btnApply)
        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCount = findViewById<Button>(R.id.btnCount)
        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val secondName = etSecondName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("MainActivity", "$firstName $secondName, born on $birthDate , from $country just applied to the formular")
        }

        //*********** Lets Count Together *********
        var count = 0
        btnCount.setOnClickListener {
            count++
            tvCount.text = "Let's Count together : $count "
        }

        //********** Calculator to Add two number *********
        btnAdd.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()
            val result = firstNumber + secondNumber
            tvResult.text =result.toString()
        }

    }
}