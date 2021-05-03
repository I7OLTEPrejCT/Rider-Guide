package com.example.uiguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.uiguide.databinding.ActivityLoginBinding
import com.example.uiguide.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private var backButton: ImageView? = null
    private var textRegister: TextView? = null
    lateinit var bindingClass: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
        bindingClass = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.backBtn.setOnClickListener {
            finish()
        }
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