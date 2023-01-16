package com.jeee.andoridproject2
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val image = findViewById<ImageButton>(R.id.logo)

        image.setOnClickListener {
            val Intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
