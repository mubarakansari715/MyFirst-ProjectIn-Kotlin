package com.example.myfirstprojectinkotlin

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    var lang = arrayOf("Android", "PHP", "React", "Android", "PHP", "React", "Android", "PHP", "React")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        var listView:ListView = findViewById<ListView>(R.id.list_item)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lang)
        listView.setAdapter(arrayAdapter)
        listView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,lang[position], Toast.LENGTH_SHORT).show()
        })
    }
}