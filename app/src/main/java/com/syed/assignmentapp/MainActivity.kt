package com.syed.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etmb : EditText
    lateinit var etpass: EditText
    lateinit var tvfp: TextView
    lateinit var tvreg: TextView
    lateinit var btlogin: Button
    val mobileno :String ="1234567890"
    val cpass: String="asdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title=getString(R.string.main_activity_name)
        etmb=findViewById(R.id.etmb)
        etpass=findViewById(R.id.etpass)
        tvfp=findViewById(R.id.tvfp)
        tvreg=findViewById(R.id.tvreg)
        btlogin=findViewById(R.id.btlogin)
        tvreg.setOnClickListener{
            val intent1= Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intent1)
        }
        btlogin.setOnClickListener{
            val umb=etmb.text.toString()
            val upass=etpass.text.toString()
            println(umb)
            if((umb == mobileno) && (upass == cpass))
            {
                val intent= Intent(this@MainActivity, LoginSuccessActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity,"Incorrect Password or Mobile Number ",Toast.LENGTH_LONG).show()
            }
        }
       tvfp.setOnClickListener{
            val intent1= Intent(this@MainActivity, ForgotPasswordActivity::class.java)
            startActivity(intent1)
        }

    }
}