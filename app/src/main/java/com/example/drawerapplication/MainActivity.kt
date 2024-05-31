package com.example.drawerapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawer : DrawerLayout
    lateinit var navView : NavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.navView)
        drawer = findViewById(R.id.drawer_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Navigation Drawer"

        toggle = ActionBarDrawerToggle(this@MainActivity, drawer,
            0, 0)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return toggle.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.PplgDrawer -> Toast.makeText(this@MainActivity, "DRAWER PPLG", Toast.LENGTH_SHORT).show()
            R.id.KulinerDrawer -> Toast.makeText(this@MainActivity, "DRAWER KULINER", Toast.LENGTH_SHORT).show()
            R.id.ToDrawer -> Toast.makeText(this@MainActivity, "DRAWER TO", Toast.LENGTH_SHORT).show()
            R.id.TpflDrawer -> Toast.makeText(this@MainActivity,  "DRAWER TPFL", Toast.LENGTH_SHORT).show()
            R.id.BusanaDrawer -> Toast.makeText(this@MainActivity, "DRAWER BUSANA", Toast.LENGTH_SHORT).show()
        }
        return TODO("Provide the return value")
    }
}