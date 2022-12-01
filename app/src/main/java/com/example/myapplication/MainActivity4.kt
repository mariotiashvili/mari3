package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val USERNAME = intent.extras?.getString("NAME1")

        var namefor4 = findViewById<TextView>(R.id.textView12)


        namefor4.text = USERNAME
    }
}