package com.jeee.andoridproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var  textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        textView = findViewById(R.id.textView)

        val  username = intent.getStringExtra("username")
        textView.text = "username"
    }
}