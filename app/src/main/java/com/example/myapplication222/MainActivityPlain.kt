package com.example.myapplication222

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication222.databinding.ActivityMainBinding

class MainActivityPlain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById<ImageButton>(R.id.like).setOnClickListener {
           //if (it !is ImageButton) {
            //   return@setOnClickListener
         // }

         //  it.setImageResource(R.drawable.ic_liked_24)
       }
    }
