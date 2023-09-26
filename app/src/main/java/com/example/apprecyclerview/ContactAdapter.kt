package com.example.apprecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ContactAdapter(private var contacts: ArrayList<Contact>) : Adapter<ContactPrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_agenda, parent, false)
        return ContactPrototype(view)
    }

    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}

class ContactPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvName = itemView.findViewById<TextView>(R.id.tvName)
    private val tvTelephone = itemView.findViewById<TextView>(R.id.tvCell)

    fun bind(contact: Contact) {
        tvName.text = contact.name
        tvTelephone.text = contact.telephone
    }
}
