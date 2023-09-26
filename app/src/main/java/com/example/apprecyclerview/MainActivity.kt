package com.example.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var contacts = ArrayList<Contact>()
    private var contactAdapter = ContactAdapter(contacts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()
        initView()
    }

    private fun initView() {
        val rvAgenda = findViewById<RecyclerView>(R.id.rvAgenda)
        rvAgenda.adapter = contactAdapter
        rvAgenda.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts.add(Contact("Wilver", "922529107"))
        contacts.add(Contact("Jack", "922529108"))
        contacts.add(Contact("Brandon", "922529109"))
        contacts.add(Contact("Lizbeth", "922529110"))
    }
}