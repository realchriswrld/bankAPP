package com.example.bankappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Dtb_activity : AppCompatActivity() {
    lateinit var  myDtb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dtb)
        myDtb = findViewById(R.id.dtbwebview)
        val webSettings = myDtb.settings
        webSettings.javaScriptEnabled = true
        myDtb.loadUrl("https://dtbk.dtbafrica.com/")
    }
}