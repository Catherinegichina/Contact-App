package com.example.contactslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var btnnext=findViewById<Button>(R.id.btnnext)
        btnnext.setOnClickListener {
            var intent=Intent(baseContext,contacts_list::class.java)
            startActivity(intent)
        }

    }

}