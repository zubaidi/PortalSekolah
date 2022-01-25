package com.example.portalsekolah

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.cardview.widget.CardView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val lokasi = view?.findViewById<CardView>(R.id.lokasi)
        lokasi?.setOnClickListener{
            requireActivity().run {
                startActivity(Intent(this, LokasiActivity::class.java))
                finish()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageLogout = view?.findViewById<ImageView>(R.id.moreLogout)
        imageLogout?.setOnClickListener {
            val popupMenu = activity?.let { it1 -> androidx.appcompat.widget.PopupMenu(it1, imageLogout) }
            popupMenu?.menuInflater?.inflate(R.menu.logout_menu, popupMenu.menu)
            popupMenu?.setOnMenuItemClickListener(
                androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
                    item: MenuItem? -> when(item?.itemId){
                        R.id.logout_menu -> requireActivity().run {
                            startActivity(Intent(this, LoginActivity::class.java))
                            finish()
                        }
                    }
                    true
                }
            )
            popupMenu?.show()
        }
    }

}