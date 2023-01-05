package com.example.sizeoftext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickHere = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickHere.setOnClickListener{
            timesClicked += 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey I'm Kalkidan!", Toast.LENGTH_SHORT).show()
        }
    }
}