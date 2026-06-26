package com.example.authproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgetPasswordActivity : AppCompatActivity() {

    private lateinit var fgLogin: Button
    private lateinit var btnReset: Button // নতুন যোগ করা হলো

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forget_password)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_forget_password)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fgLogin = findViewById(R.id.tvBackToLogin)
        btnReset = findViewById(R.id.btnResetPassword) // ইনিশিয়ালাইজ করা হলো

        fgLogin.setOnClickListener {
            startActivity(Intent(this@ForgetPasswordActivity, LoginActivity::class.java))
        }

        btnReset.setOnClickListener {
            // জাস্ট মক মেসেজ একশন
            Toast.makeText(this, "Reset link sent to your email!", Toast.LENGTH_SHORT).show()
        }
    }
}