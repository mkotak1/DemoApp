package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var bHellow : Button
        bHellow = findViewById(R.id.bHello)
        bHellow.setOnClickListener {
            Toast.makeText(applicationContext, "Hello the button is clicked", Toast.LENGTH_SHORT).show()
        }
    }
}

