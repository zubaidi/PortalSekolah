package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgetPassActivity : AppCompatActivity() {
    private lateinit var lupa : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pass)
        lupa = findViewById(R.id.textLogin)
        lupa.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}