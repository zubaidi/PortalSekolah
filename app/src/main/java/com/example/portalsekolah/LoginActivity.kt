package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var login : TextView
    private lateinit var home : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login = findViewById(R.id.textLupaPassword)
        home = findViewById(R.id.btnLogin)
        login.setOnClickListener {
            startActivity(Intent(this, ForgetPassActivity::class.java))
        }
        home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}