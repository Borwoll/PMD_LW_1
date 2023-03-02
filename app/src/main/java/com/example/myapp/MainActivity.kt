package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


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

    fun goToDetailActivity(view: View?) {
        Log.w("MyApp", "MainActivity go_to_detail_activity() called")
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    fun openWebYandexRu(view: View?) {
        Log.w("MyApp", "MainActivity open_web() called")
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.ru"))
        startActivity(intent)
    }
}