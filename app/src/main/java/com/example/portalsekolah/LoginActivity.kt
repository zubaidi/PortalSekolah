package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

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
                val user = username.text.toString()
                val pass = password.text.toString()
                if(user.equals("Admin") && pass.equals("Admin")) {
                    startActivity(Intent(this, HomeActivity::class.java))
                }else{
                    Toast.makeText(this, "Username atau Password Tidak Sesuai", Toast.LENGTH_LONG).show()
                }
            }
        }
        login.setOnClickListener {
            startActivity(Intent(this, ForgetPassActivity::class.java))
        }
    }
}