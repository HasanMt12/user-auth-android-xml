package com.example.authproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {

    private lateinit var loginBtn: Button
    private lateinit var googleBtn: ImageView
    private lateinit var githubBtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_register)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loginBtn = findViewById(R.id.tvLoginLink)
        googleBtn = findViewById(R.id.googleR)
        githubBtn = findViewById(R.id.githubR)


        loginBtn.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }
        googleBtn.setOnClickListener{
            Toast.makeText(this, "Google Sign-In coming soon!", Toast.LENGTH_SHORT).show()
        }
        githubBtn.setOnClickListener {
            Toast.makeText(this, "Github Sign-In coming soon!", Toast.LENGTH_SHORT).show()
        }
    }
}