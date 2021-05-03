package com.example.uiguide

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.core.view.isVisible
import com.example.uiguide.databinding.ActivityLoginBinding
import com.example.uiguide.databinding.ActivityStaffListBinding

class StaffListActivity : AppCompatActivity() {
    lateinit var staffList: ActivityStaffListBinding
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        staffList = ActivityStaffListBinding.inflate(layoutInflater)
        setContentView(staffList.root)
        staffList.addBtn.setOnClickListener {
            staffList.delUser.visibility = View.VISIBLE
            staffList.addUser.visibility = View.VISIBLE
            staffList.closeUserAddBtn.visibility = View.VISIBLE
            staffList.addBtn.visibility = View.GONE
        }
        staffList.closeUserAddBtn.setOnClickListener {
            staffList.delUser.visibility = View.GONE
            staffList.addUser.visibility = View.GONE
            staffList.closeUserAddBtn.visibility = View.GONE
            staffList.addBtn.visibility = View.VISIBLE
        }
    }
}