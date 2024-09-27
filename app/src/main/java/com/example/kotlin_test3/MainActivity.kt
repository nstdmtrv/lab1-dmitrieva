package com.example.kotlin_test3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeNumberCalculator = PrimeNumberCalculator()

        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val inputArray: EditText = findViewById(R.id.inputArray)
        val outputResult: TextView = findViewById(R.id.outputResult)

        btnCalculate.setOnClickListener {
            val inputText = inputArray.text.toString()

            val numbers = inputText.split(",").mapNotNull { it.trim().toIntOrNull() }
            if (numbers.isNotEmpty()) {
                val sum = primeNumberCalculator.sumOfPrimes(numbers)
                outputResult.text = "Сумма простых чисел: $sum"
            } else {
                outputResult.text = "Неверный ввод. Введите числа через запятую."
            }
        }
    }
}