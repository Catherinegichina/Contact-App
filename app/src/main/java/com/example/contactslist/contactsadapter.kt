package com.example.contactslist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.solver.state.State
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class contactsadapter( var contactsList:List<contacts>,var context: Context):RecyclerView.Adapter<ContactViewholder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewholder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item,parent,false)
        return ContactViewholder(itemView)
//        creates an instance of our viewholder./creates a viewholder.
//        inflate takes in 3 parameters.
//        false-we dont want the whole recyclerview toknow jabe has been tapped.
    }

    override fun onBindViewHolder(holder: ContactViewholder, position: Int) {
        var contacts=contactsList.get(position)
//        .getposition-current contact at the current position.
//        after 1,it passes here,n recyler view inasema it has created a space
//        for that which has been created.
//        everytime a view is created or created,the onbind view holder is called when a new position has been formed.
        holder.tvname.text = contacts.name
        holder.tvemail.text=contacts.email
        holder.tvnumber.text=contacts.phonenumber
        Picasso
//      processes that image url.
//      we want it into our display.
            .get()
            .load(contacts.imageUrl)
//                then display it in our holder.
            .into(holder.imgContacts)
            holder.clContact.setOnClickListener{
            var intent=Intent(context,ViewContactActivity::class.java)
                intent.putExtra("name",contacts.name)
                intent.putExtra("phonenumber",contacts.phonenumber)
                intent.putExtra("email",contacts.email)
                intent.putExtra("imageUrl",contacts.imageUrl)
                context.startActivity(intent)

            }
//        takes in a url-load
//        picasso needs access to context.
    }

    override fun getItemCount(): Int {
       return contactsList.size
//        used by the recycler view itself.
//        how many items it expects to hold.



    }
}

class ContactViewholder( var itemView:View):RecyclerView.ViewHolder(itemView){
//    takes in an item view which is an object of type view.
//    inherits from recyclerview.vh.vh is an inner class n we access it using the dot.
//    cast the views in our individual rows.
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvnumber=itemView.findViewById<TextView>(R.id.tvnumber)
    var imgContacts=itemView.findViewById<ImageView>(R.id.imgContacts)
    var clContact=itemView.findViewById<CardView>(R.id.clContact)
}