package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        Log.w("MyApp", "DetailActivity onCreate() called")
    }

    override fun onStart() {
        super.onStart()
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