package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.DiceBtn)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll2()
        val resultTv: TextView = findViewById(R.id.NumberTv)
        resultTv.text = diceRoll.toString()

        val resultTv2: TextView = findViewById(R.id.NumberTv2)
        resultTv2.text = diceRoll2.toString()

    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
    fun roll2(): Int {
        return (1..numSides).random()
    }
}