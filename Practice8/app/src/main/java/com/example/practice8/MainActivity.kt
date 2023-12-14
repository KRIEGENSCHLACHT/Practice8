package com.example.practice8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.red_button)
        val greenButton: Button = findViewById(R.id.green_button)
        val orangeButton: Button = findViewById(R.id.orange_button)
        val textView: TextView = findViewById(R.id.textView3)
        val rLayout: ConstraintLayout = findViewById(R.id.root_layout)

        redButton.setOnClickListener{
            textView.text = "КРАСНЫЙ"
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        greenButton.setOnClickListener{
            textView.text = "ЗЕЛЁНЫЙ"
            rLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
        orangeButton.setOnClickListener{
            textView.text = "ОРАНЖЕВЫЙ"
            rLayout.setBackgroundColor(resources.getColor(R.color.orangeColor, null))
        }
    }
}