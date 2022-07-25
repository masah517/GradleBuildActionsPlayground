package com.example.gradlebuildactiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("hello from develop update")
        Log.d("MAINCACITIVITY_LOG", "Any msg from log")
    }
}