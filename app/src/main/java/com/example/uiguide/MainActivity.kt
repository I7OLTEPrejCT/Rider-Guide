package com.example.uiguide

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var loginButton: Button? = null
    private var textRegister: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        loginButton = findViewById(R.id.loginBtn)
        textRegister = findViewById(R.id.textRegister)

        loginButton!!.setOnClickListener(View.OnClickListener {
//            finish()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })

        textRegister!!.setOnClickListener(View.OnClickListener {
//            finish()
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}