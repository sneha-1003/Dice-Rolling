package com.example.dice_rolling



import android.os.Bundle
import kotlin.random.Random
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {

    private lateinit var diceImageView: ImageView
    private lateinit var rollButton: Button
    private lateinit var rollResultTextView: TextView
    private lateinit var headingView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        headingView = findViewById(R.id.headingView)
        diceImageView = findViewById(R.id.diceImageView)
        rollButton = findViewById(R.id.rollButton)
        rollResultTextView = findViewById(R.id.rollResultTextView)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(1, 7)
        val drawableResource = when (randomInt) {
            1 -> {
                rollResultTextView.text = "1"
                R.drawable.dice1
            }
            2 -> {
                rollResultTextView.text = "2"
                R.drawable.dice2
            }
            3 -> {
                rollResultTextView.text = "3"
                R.drawable.dice3
            }
            4 -> {
                rollResultTextView.text = "4"
                R.drawable.dice4
            }
            5 -> {
                rollResultTextView.text = "5"
                R.drawable.dice5
            }
            else -> {
                rollResultTextView.text = "6"
                R.drawable.dice6
            }
        }
        diceImageView.setImageResource(drawableResource)
    }
}

