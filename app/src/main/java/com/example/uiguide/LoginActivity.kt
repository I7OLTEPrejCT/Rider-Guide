package com.example.uiguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private var backButton: ImageView? = null
    private var textRegister: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onResume() {
        super.onResume()
        backButton = findViewById(R.id.backBtn)
        textRegister = findViewById(R.id.textRegisterFromLogin)

        backButton!!.setOnClickListener(View.OnClickListener {
            finish()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        textRegister!!.setOnClickListener(View.OnClickListener {
            finish()
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}