package com.syed.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var btnnext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        title="Forgot Password"
        et1=findViewById(R.id.et1)
        et2=findViewById(R.id.et2)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener{
            val umb=et1.text.toString()
            val uemail=et2.text.toString()
            println(umb)
            if((umb!=null) && (umb.length == 10) &&(uemail!=null))
            {
                val intent2= Intent(this@ForgotPasswordActivity, ForgottenDetailsActivity::class.java)
                intent2.putExtra("Fmobileno",umb)
                intent2.putExtra("Femail",uemail)
                startActivity(intent2)
            }
            else {
                Toast.makeText(this@ForgotPasswordActivity,"Enter the needed Credentials Correctly ", Toast.LENGTH_LONG).show()
            }
        }


    }
}