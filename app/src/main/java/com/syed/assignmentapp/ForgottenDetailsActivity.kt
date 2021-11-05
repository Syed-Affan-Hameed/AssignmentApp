package com.syed.assignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgottenDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotten_details)
        title="Entered details for forgotten details"
        var tvf1: TextView = findViewById(R.id.tvf1)
        var tvf2: TextView = findViewById(R.id.tvf2)
        if(intent!=null){
            tvf1.text=intent.getStringExtra("Fmobileno")
            tvf2.text=intent.getStringExtra("Femail")
        }
    }
}