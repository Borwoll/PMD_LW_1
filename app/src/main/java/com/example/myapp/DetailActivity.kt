package com.example.myapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.w("MyApp", "DetailActivity onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val bagBadge = bottomNavigationView.getOrCreateBadge(R.id.cart_cost)
        bagBadge.isVisible = true
        bagBadge.number = 5
        bagBadge.maxCharacterCount = 99
        bagBadge.backgroundColor = Color.rgb(129,190,88)
        bagBadge.badgeTextColor = Color.WHITE
        bagBadge.badgeGravity = BadgeDrawable.TOP_END

        val favoriteBadge = bottomNavigationView.getOrCreateBadge(R.id.favorites)
        favoriteBadge.isVisible = true
        favoriteBadge.backgroundColor = Color.rgb(129,190,88)
        favoriteBadge.badgeTextColor = Color.WHITE
        favoriteBadge.badgeGravity = BadgeDrawable.TOP_END

        Log.w("MyApp", "DetailActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyApp", "DetailActivity onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.w("MyApp", "DetailActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyApp", "DetailActivity onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyApp", "DetailActivity onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyApp", "DetailActivity onDestroy() called")
    }
}