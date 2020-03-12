package com.kuljot.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnCount: Button
    lateinit var txtCount: TextView
    lateinit var btnReset: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a=0
        btnCount=findViewById(R.id.btnCount)
        btnReset=findViewById(R.id.btnReset)
        txtCount=findViewById(R.id.txtCount)
        btnCount.setOnClickListener {
            a += 1
            txtCount.text= a.toString()
        }
        btnReset.setOnClickListener {
            a =0
            txtCount.text= a.toString()
        }
    }
}
