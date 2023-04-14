package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class equity_activity : AppCompatActivity() {
    lateinit var  myequity: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)
        myequity = findViewById(R.id.equitywebview)
        val webSettings = myequity.settings
        webSettings.javaScriptEnabled = true
        myequity.loadUrl("https://equitygroupholdings.com")
    }
}