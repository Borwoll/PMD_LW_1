package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w("MyApp", "MainActivity onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.w("MyApp", "MainActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyApp", "MainActivity onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.w("MyApp", "MainActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyApp", "MainActivity onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyApp", "MainActivity onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyApp", "MainActivity onDestroy() called")
    }
}