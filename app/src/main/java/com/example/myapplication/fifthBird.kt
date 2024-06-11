package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fifthBird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth_bird)
       val imageView13= findViewById<ImageView>(R.id.imageView13)
        val imageView14= findViewById<ImageView>(R.id.imageView14)

        imageView13.setOnClickListener {
            finish()
        }
        imageView14.setOnClickListener {
            val intent=Intent(this,fourthBird::class.java)
        }
    }
}