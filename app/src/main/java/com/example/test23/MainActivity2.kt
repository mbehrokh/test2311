package com.example.test23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle: Bundle? =intent.extras
        val tv_name = findViewById<TextView>(R.id.ac_main2_tv_name)
        tv_name.text= bundle?.get("name").toString()
    }
}