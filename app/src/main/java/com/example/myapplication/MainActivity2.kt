package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name2 = findViewById<EditText>(R.id.name2)
        val password2 = findViewById<EditText>(R.id.password2)
        val password3 = findViewById<EditText>(R.id.password3)
        var mynumber = findViewById<EditText>(R.id.mynumber)
        val myprofilebutton = findViewById<TextView>(R.id.myprofilebutton)

        intent = Intent(this,MainActivity3::class.java)


        findViewById<TextView>(R.id.myprofilebutton).setOnClickListener {
            var name3 = name2.text.toString()
            var password4 = password2.text.toString()
            var password5 = password3.text.toString()
            var number1 = mynumber.text.toString()
            if (name3 == "") {
                Toast.makeText(this, "please,enter your name", Toast.LENGTH_LONG).show()
            } else if (password4 == "") {
                Toast.makeText(this, "please,enter your password", Toast.LENGTH_LONG).show()
            } else if (password5 == "") {
                Toast.makeText(this, "please,enter your password again", Toast.LENGTH_LONG).show()

            } else if (number1 == "") {
                Toast.makeText(this, "please,enter your number", Toast.LENGTH_LONG).show()
            } else
                    name2 = findViewById(R.id.name2)
                    mynumber = findViewById(R.id.mynumber)

                    myprofilebutton.setOnClickListener {
                        val namefor3 = name2.text.toString()
                        val numberfor3 = mynumber.text.toString()
                        val PASSWORDFOR3 = password2.text.toString()
                        val intent = Intent(this, MainActivity3::class.java)
                        intent.putExtra("NAME", namefor3)
                        intent.putExtra("NUMBER", numberfor3)
                        intent.putExtra("PASSWORD", PASSWORDFOR3)

                        startActivity(intent)
                    }
        }




    }

}


