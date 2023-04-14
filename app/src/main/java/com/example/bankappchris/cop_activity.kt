package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class cop_activity : AppCompatActivity() {
    lateinit var  mycop: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cop)
        mycop = findViewById(R.id.copwebview)
        val webSettings = mycop.settings
        webSettings.javaScriptEnabled = true
        mycop.loadUrl("https://www.co-opbank.co.ke")
    }
}