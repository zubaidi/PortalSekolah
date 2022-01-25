package com.example.portalsekolah

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PengaduanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengaduan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val keDetailPengaduan = view?.findViewById<TextView>(R.id.lihatDetailPengaduan)
        keDetailPengaduan.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, PengaduanDetailActivity::class.java))
            }
        }
    }
}