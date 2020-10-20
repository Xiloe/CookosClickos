package fr.xiloe.cookosclickos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay: Button = findViewById(R.id.play)
        btnPlay.setOnClickListener {
            val gameActivity = Intent(applicationContext, CookieActivity::class.java)
            startActivity(gameActivity)
            finish()
        }
    }
}