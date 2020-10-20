package fr.xiloe.cookosclickos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CookieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cookie)

        val cookie: ImageView = findViewById(R.id.cookie)
        val scoreView: TextView = findViewById(R.id.score)
        var score = 0

        // Reset/Init the placeholder
        scoreView.text = getString(R.string.score, score)

        cookie.setOnClickListener {
            score++
            scoreView.text = getString(R.string.score, score)
        }
    }
}