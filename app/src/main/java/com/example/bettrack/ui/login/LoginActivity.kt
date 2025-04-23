package com.example.bettrack.ui.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bettrack.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailField = findViewById<EditText>(R.id.editTextEmail)
        val passwordField = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            // Simples verificação fake por enquanto
            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login realizado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha os campos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}