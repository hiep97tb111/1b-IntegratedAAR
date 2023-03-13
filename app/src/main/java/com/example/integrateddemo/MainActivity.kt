package com.example.integrateddemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.stepcounter.MainCounterAct

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvHelloWorld).setOnClickListener {
            startActivity(Intent(this, MainCounterAct::class.java))
        }
    }
}