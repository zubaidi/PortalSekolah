package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var login : TextView
    private lateinit var home : Button
    private lateinit var username : EditText
    private lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById(R.id.editUserID)
        password = findViewById(R.id.editPassword)
        login = findViewById(R.id.textLupaPassword)
        home = findViewById(R.id.btnLogin)
        home.setOnClickListener {
            if(username.text.toString().length == 0){
                username.setError("User ID anda salah")
            }else if(password.text.toString().length == 0){
                password.setError("Password tidak sesuai")
            }else{
                if(login.text.toString().equals("Admin") && password.text.toString().equals("Admin"))
                    startActivity(Intent(this, HomeActivity::class.java))
            }
        }
        login.setOnClickListener {
            startActivity(Intent(this, ForgetPassActivity::class.java))
        }
    }
}