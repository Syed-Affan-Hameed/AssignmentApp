package com.syed.assignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import androidx.appcompat.widget.Toolbar

class DetailsActivity : AppCompatActivity() {
    var toolbar: Toolbar = findViewById(R.id.toolbar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        title="Details"
        var tv0: TextView = findViewById(R.id.tv0)
        var tv2: TextView = findViewById(R.id.tv2)
        var tv3: TextView = findViewById(R.id.tv3)
        var tv4: TextView = findViewById(R.id.tv4)

        var tv5: TextView = findViewById(R.id.tv5)
        setUpToolbar()
        if(intent!=null) {
            tv0.text = intent.getStringExtra("Mobileno")
            tv2.text = intent.getStringExtra("Email")
            tv3.text = intent.getStringExtra("Name")
            tv4.text = intent.getStringExtra("Address")
            tv5.text = intent.getStringExtra("Password")
        }
    }
    fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title="Workspace"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}