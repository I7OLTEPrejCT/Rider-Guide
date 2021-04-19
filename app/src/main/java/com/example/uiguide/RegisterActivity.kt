package com.example.uiguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    private var backButton: ImageView? = null
    var textLogin: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    override fun onResume() {
        super.onResume()
        backButton = findViewById(R.id.backBtn)
        textLogin = findViewById(R.id.textLogin)

        backButton!!.setOnClickListener(View.OnClickListener {
            finish()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        textLogin!!.setOnClickListener(View.OnClickListener {
            finish()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })
    }
}