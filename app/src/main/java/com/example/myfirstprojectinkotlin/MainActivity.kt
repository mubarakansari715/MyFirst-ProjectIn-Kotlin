package com.example.myfirstprojectinkotlin


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn)
        var email = findViewById<EditText>(R.id.email)
        var pass = findViewById<EditText>(R.id.pass)
        var tv1 = findViewById<TextView>(R.id.tv_email)
        var tv2 = findViewById<TextView>(R.id.tv_pass)

        btn.setOnClickListener() {
            var edt1 = email.text.toString()
            var edt2 = pass.text.toString()

            tv1.setText(edt1)
            tv2.setText(edt2)

        }

    }

    fun Intents(view: View) {
        val intent = Intent(this, DataActivity::class.java)
        startActivity(intent)
    }
}