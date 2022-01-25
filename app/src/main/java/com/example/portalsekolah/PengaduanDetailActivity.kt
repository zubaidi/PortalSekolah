package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment

class PengaduanDetailActivity : AppCompatActivity() {
    private var PengaduanFragment = com.example.portalsekolah.PengaduanFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaduan_detail)
        val kembali = findViewById<ImageView>(R.id.tombolKembali)
        kembali.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}