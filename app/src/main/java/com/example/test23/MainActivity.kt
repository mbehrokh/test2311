package com.example.test23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_name =findViewById<EditText>(R.id.ac_main_edt_name)
        val btn_ok = findViewById<Button>(R.id.ac_main_btn_ok)
        btn_ok.setOnClickListener {
            Toast.makeText(this,edt_name.text,Toast.LENGTH_LONG).show()
            var intent:Intent= Intent(this,MainActivity2::class.java)
                intent.putExtra("name",edt_name.text)
                intent.putExtra("family",edt_name.text)

            startActivity(intent)
        }
    }
}