package com.jeee.andoridproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private lateinit var  login: Button
    private lateinit var  username: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        val button1 = findViewById<Button>(R.id.login)
        val text1 = findViewById<EditText>(R.id.username)

        button1.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java).putExtra("username",username.toString()))
        }

    }
}