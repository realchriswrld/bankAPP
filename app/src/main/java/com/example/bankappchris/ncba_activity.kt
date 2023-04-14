package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ncba_activity : AppCompatActivity() {
    lateinit var  myncba: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncba)
        myncba = findViewById(R.id.ncbawebview)
        val webSettings = myncba.settings
        webSettings.javaScriptEnabled = true
        myncba.loadUrl("https://ke.ncbagroup.com")
    }
}