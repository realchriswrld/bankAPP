package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class kcb_activity : AppCompatActivity() {
    lateinit var  mykcb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        mykcb = findViewById(R.id.kcbwebview)
        val webSettings = mykcb.settings
        webSettings.javaScriptEnabled = true
        mykcb.loadUrl("https://ke.kcbgroup.com")
    }
}