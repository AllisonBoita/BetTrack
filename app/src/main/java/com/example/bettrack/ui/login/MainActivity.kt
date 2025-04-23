package com.example.bettrack.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bettrack.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicia direto a tela de login
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}