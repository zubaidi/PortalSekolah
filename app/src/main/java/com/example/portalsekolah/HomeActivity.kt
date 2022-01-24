package com.example.portalsekolah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private var HomeFragment = com.example.portalsekolah.HomeFragment()
    private var MessageFragment = com.example.portalsekolah.MessageFragment()
    private var PengaduanFragment = com.example.portalsekolah.PengaduanFragment()
    private lateinit var frameContainer : FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        frameContainer=findViewById(R.id.frameContainer)
        val BNV = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        replaceFragment(HomeFragment)
        BNV.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.Beranda -> replaceFragment(HomeFragment)
                R.id.Pengaduan -> replaceFragment(PengaduanFragment)
                R.id.add -> HomeFragment
                R.id.pesan -> replaceFragment(MessageFragment)
                R.id.akun -> MessageFragment
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        if(fragment!=null){
            val nav=supportFragmentManager.beginTransaction()
                .replace(R.id.frameContainer, fragment)
                .commit()
        }
    }
}