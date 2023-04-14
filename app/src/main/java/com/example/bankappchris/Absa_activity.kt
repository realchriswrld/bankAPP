package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Absa_activity : AppCompatActivity() {
    lateinit var  myAbsa:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)
        myAbsa = findViewById(R.id.absawebview)
        val webSettings = myAbsa.settings
        webSettings.javaScriptEnabled = true
        myAbsa.loadUrl("https://www.absabank.co.ke/personal/")
    }
}