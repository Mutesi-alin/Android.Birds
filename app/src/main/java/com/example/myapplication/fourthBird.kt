package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fourthBird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_bird)
        val imageView10= findViewById<ImageView>(R.id.imageView10)
        val imageView11= findViewById<ImageView>(R.id.imageView11)

        imageView10.setOnClickListener { finish() }
        imageView11.setOnClickListener {
            val intent=Intent(this,fifthBird::class.java)
        }

    }
}