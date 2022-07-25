package com.example.gradlebuildactiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("hello from develop update")
        Toast.makeText(applicationContext, "Any msg from log", Toast.LENGTH_SHORT).show()
    }
}