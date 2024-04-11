package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.Aperte)
        rollButton.setOnClickListener { rollDice()
    }

}
    private fun rollDice() {
    val dice = Diceroller(6)
    val diceRoll = dice.roll()
    val diceImage: ImageView = findViewById(R.id.imageView)

    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.lado1)
        2 -> diceImage.setImageResource(R.drawable.lado2)
        3 -> diceImage.setImageResource(R.drawable.lado3)
        4 -> diceImage.setImageResource(R.drawable.lado4)
        5 -> diceImage.setImageResource(R.drawable.lado5)
        6 -> diceImage.setImageResource(R.drawable.lado6)
    }
    val sortRoll = dice.roll()
    val sortTextView: TextView = findViewById(R.id.luckyNumber)
    val txtResultado: TextView = findViewById(R.id.txtRes)
    sortTextView.text = sortRoll.toString();

    if( diceRoll == sortRoll){
        txtResultado.setText("Parabéns!")
    }else{
        txtResultado.setText("Tente Novamente!")
    }
}
}