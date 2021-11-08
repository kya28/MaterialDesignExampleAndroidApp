package com.example.appusingmaterialdesing

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AppBarsTop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_bars_top)
//        setSupportActionBar(findViewById(R.id.toolbar))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_app_top_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.item_login -> {
            Toast.makeText(this, "Login action", Toast.LENGTH_LONG).show()
            true
        }
        android.R.id.home -> {
            val buttonHome: Button = findViewById(R.id.home)
            val intent_home = Intent(this, MainActivity::class.java)
            buttonHome.setOnClickListener {
                startActivity(intent_home)
            }
            true
        }
        R.id.item_help -> {
            Toast.makeText(this, "Help action", Toast.LENGTH_LONG).show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
