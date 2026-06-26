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

class LoginActivity : AppCompatActivity() {

    private lateinit var myVariable: Button
    private lateinit var myRegister: Button

    private lateinit var forgetBtn: Button

    private lateinit var googleBtnL: ImageView
    private lateinit var githubBtnL: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        myVariable = findViewById(R.id.btnLogin)
        myRegister = findViewById(R.id.tvRegisterLink)
        forgetBtn = findViewById(R.id.tvForgetPassword)
        googleBtnL = findViewById(R.id.google)
        githubBtnL = findViewById(R.id.github)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myVariable.setOnClickListener {
            Toast.makeText(this, "Sign in Successful", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
        }

        myRegister.setOnClickListener {
          startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }

        forgetBtn.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgetPasswordActivity::class.java))
        }

        googleBtnL.setOnClickListener{
            Toast.makeText(this, "Google Sign-In coming soon!", Toast.LENGTH_SHORT).show()
        }
        githubBtnL.setOnClickListener {
            Toast.makeText(this, "Github Sign-In coming soon!", Toast.LENGTH_SHORT).show()
        }
    }
}