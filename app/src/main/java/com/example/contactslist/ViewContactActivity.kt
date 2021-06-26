package com.example.contactslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity(){
//    lateinit var tvname2:TextView
//    lateinit var tvnumber2:TextView
//    lateinit var tvemail2:TextView
//    lateinit var imgview:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
//        var intent=intent
        var tvname2=intent.getStringExtra("name")
        var tvemail2=intent.getStringExtra("email")
        var tvnumber2=intent.getStringExtra("number")
        var imageView=intent.getStringExtra("image").toString()


        var tvname=findViewById<TextView>(R.id.tvname2)
        var tvemail=findViewById<TextView>(R.id.email2)
        var tvnumber=findViewById<TextView>(R.id.tvnumber2)
        var image=findViewById<ImageView>(R.id.imgview)

        tvname.text=tvname2
        tvemail.text=tvemail2
        tvnumber.text=tvnumber2
        Picasso.get().load(imageView).into(image)

    }
}