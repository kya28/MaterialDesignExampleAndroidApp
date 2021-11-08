package com.example.appusingmaterialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAppBarsTop : Button = findViewById(R.id.button_app_bars_top)
        val intent_app_bars_top = Intent(this, AppBarsTop::class.java)
        buttonAppBarsTop.setOnClickListener {
            startActivity(intent_app_bars_top)
        }
        val buttonBottomNavigation : Button = findViewById(R.id.button_bottom_navigation)
        val intent_bottom_navigation = Intent(this, BottomNavigation::class.java)
        buttonBottomNavigation.setOnClickListener {
            startActivity(intent_bottom_navigation)
        }
        val buttonCards : Button = findViewById(R.id.button_cards)
        val intent_cards = Intent(this, Cards::class.java)
        buttonCards.setOnClickListener {
            startActivity(intent_cards)
        }
        val buttonDialogs : Button = findViewById(R.id.button_dialogs)
        val intent_dialogs = Intent(this, Dialogs::class.java)
        buttonDialogs.setOnClickListener {
            startActivity(intent_dialogs)
        }
        val buttonNavigationDrawer : Button = findViewById(R.id.button_navigation_drawer)
        val intent_navigation_drawer = Intent(this, NavigationDrawer::class.java)
        buttonNavigationDrawer.setOnClickListener {
            startActivity(intent_navigation_drawer)
        }
    }
}
