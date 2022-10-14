package com.example.davaleba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val result = intent.getStringExtra("result")

        val textView= findViewById<TextView>(R.id.displayReslt).apply {
            text = result
        }
    }
}