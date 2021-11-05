package com.syed.assignmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {
    lateinit var etmbr : EditText
    lateinit var etpassword: EditText
    lateinit var etname:EditText
    lateinit var etpasscon: EditText
    lateinit var btregister: Button
    lateinit var etaddress: EditText
    lateinit var etemail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        etmbr=findViewById(R.id.etmbr)
        etpassword=findViewById(R.id.etpassword)
        etpasscon=findViewById(R.id.etpasscon)
        etname=findViewById(R.id.etname)
        etmbr=findViewById(R.id.etmbr)
        etemail=findViewById(R.id.etemail)
        btregister=findViewById(R.id.btnreg)
        etaddress=findViewById(R.id.etaddress)

        btregister.setOnClickListener{
            val mobilenumber = etmbr.text.toString()
            val emailId= etemail.text.toString()
            val  username=etname.text.toString()
            val address= etaddress.text.toString()
            val password=etpassword.text.toString()
            val confirmedpass=etpasscon.text.toString()
            val concealedpass="******"+ password[password.length -2] + password[password.length -1]
           if(password==confirmedpass)
            {

                val intent1: Intent= Intent(this@RegistrationActivity, DetailsActivity::class.java)
                intent1.putExtra("Mobileno",mobilenumber)
                intent1.putExtra("Email",emailId)
                intent1.putExtra("Name",username)
                intent1.putExtra("Address",address)
                intent1.putExtra("Password",concealedpass)
                startActivity(intent1)

            }
            else{
                Toast.makeText(this@RegistrationActivity,"Enter Password fields Correctly",Toast.LENGTH_LONG).show()
            }

        }



    }
}