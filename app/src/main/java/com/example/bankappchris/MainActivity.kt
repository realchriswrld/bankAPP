package com.example.bankappchris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnabsa: Button
    lateinit var btndtb: Button
    lateinit var btncop: Button
    lateinit var btnequity: Button
    lateinit var btnkcb: Button
    lateinit var btnncba: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnabsa = findViewById(R.id.Absaedt)
        btndtb = findViewById(R.id.Dtbedt)
        btncop = findViewById(R.id.Copedt)
        btnequity = findViewById(R.id.Equityedt)
        btnkcb = findViewById(R.id.kcbedt)
        btnncba = findViewById(R.id.Ncbaedt)


        btnabsa.setOnClickListener {
            val gotowebsite = Intent(this, Absa_activity::class.java)
            startActivity(gotowebsite)
        }
        btndtb.setOnClickListener {
            val gotowebsite = Intent(this, Dtb_activity::class.java)
            startActivity(gotowebsite)
        }
        btncop.setOnClickListener {
            val gotowebsite = Intent(this, cop_activity ::class.java)
            startActivity(gotowebsite)
        }
        btnequity.setOnClickListener {
            val gotowebsite = Intent(this, equity_activity::class.java)
            startActivity(gotowebsite)
        }
        btnkcb.setOnClickListener {
            val gotowebsite = Intent(this, kcb_activity::class.java)
            startActivity(gotowebsite)
        }
        btnncba.setOnClickListener {
            val gotowebsite = Intent(this, ncba_activity ::class.java)
            startActivity(gotowebsite)
        }



    }
}