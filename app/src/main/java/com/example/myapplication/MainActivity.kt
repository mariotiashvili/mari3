package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yourname = findViewById<EditText>(R.id.yourname)
        val password1 = findViewById<EditText>(R.id.password1)
        val registrationbutton = findViewById<TextView>(R.id.registration)
        val continuebutton = findViewById<TextView>(R.id.continuebutton)

        intent = Intent(this,MainActivity4::class.java)
        findViewById<TextView>(R.id.continuebutton).setOnClickListener {
            var name = yourname.text.toString()
            var pass = password1.text.toString()
            if (name == "") {
                Toast.makeText(this, "Please, Enter your Name!", Toast.LENGTH_SHORT).show()
            } else if (pass == "") {
                Toast.makeText(this, "Please, Enter your password!", Toast.LENGTH_SHORT).show()
            } else {
                val namefor1 = yourname.text.toString()

                intent.putExtra("NAME1", namefor1)

                startActivity(intent)

            }

        }
        registrationbutton.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }



    }
}