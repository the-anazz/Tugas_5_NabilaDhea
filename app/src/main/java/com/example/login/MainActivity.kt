package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister: Button = findViewById(R.id.bttlogin)

        btnRegister.setOnClickListener {
            val intent = Intent(this@MainActivity, dashboard::class.java)
            startActivity(intent)
        }

        val textforgot: TextView = findViewById(R.id.fforgot)

        textforgot.setOnClickListener {
            val intent = Intent(this@MainActivity, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}
