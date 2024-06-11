package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondBird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_bird)
      val imageView5 =findViewById<ImageView>(R.id. imageView5)
        val imageView3= findViewById<ImageView>(R.id.imageView3)
        imageView5.setOnClickListener {
            finish()
        }
        imageView3.setOnClickListener {
            val intent= Intent(this,thirdBird::class.java)
            startActivity(intent)
        }

    }
}