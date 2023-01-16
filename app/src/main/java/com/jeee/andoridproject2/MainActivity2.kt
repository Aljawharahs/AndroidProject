package com.jeee.andoridproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val login = findViewById<Button>(R.id.login)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val ViewModel = ViewModelProvider(this)[ViewModel::class.java]
        val Usernamevalue = "Aljawharah"

        login.setOnClickListener {
            if (ViewModel.Check1(username.text.toString()) && ViewModel.Check2(password.text.toString())) {
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("username", username.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "You must have the correct credential", Toast.LENGTH_LONG).show()
            }
        }
    }
}