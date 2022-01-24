package com.example.portalsekolah

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LokasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokasi)
        val kembali = findViewById<ImageView>(R.id.tombolKembali)
        kembali.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val button = findViewById<Button>(R.id.btnBukaMaps)
        button.setOnClickListener {
            this.bukaGoogleMaps()
        }
    }

    fun bukaGoogleMaps(){
            // Create a Uri from an intent string. Use the result to create an Intent.
        val gmmIntentUri: Uri = Uri.parse("google.streetview:cbll=-6.9151493,109.6654273")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        mapIntent.resolveActivity(packageManager)?.let {
            startActivity(mapIntent)
        }
    }
}