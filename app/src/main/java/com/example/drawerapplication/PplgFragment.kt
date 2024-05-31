package com.example.drawerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PplgFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        when(item.itemId){
            R.id.PplgDrawer -> {
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.content, PplgFragment())
                fragmentTransaction. commit()
                val drawer = null
                drawer.cloce()
            }
            R.id.KulinerDrawer -> {
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.content, KulinerFragment())
                fragmentTransaction.commit()
                val drawer = null
                drawer.close()
            }
            R.id.ToDrawer -> {
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.content, ToFragment))
                fragmentTransaction.commit()
                val drawer
                drawer.close()
            }
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pplg_fragment)
    }
}