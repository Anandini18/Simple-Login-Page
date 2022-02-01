package com.nandini.android.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editLogin=findViewById<EditText>(R.id.editLogin)
        val editPassword=findViewById<EditText>(R.id.editPassword)

        val btn: Button = findViewById(R.id.buttonSignup)
        btn.setOnClickListener {
            val name=editLogin.editableText.toString()
            val pass=editPassword.editableText.toString()



            Toast.makeText(
                this,
                "Username: $name and password entered",
                Toast.LENGTH_LONG
            ).show()


            if(pass.length <4){
                editPassword.setError("Password must contain atleast 4 characters.")
            }
            else {
                val intent = Intent(this, LoginDetailsActivity::class.java)
                intent.putExtra(LoginDetailsActivity.NAME_EXTRA, name)
                intent.putExtra(LoginDetailsActivity.PASS, pass)
                startActivity(intent)
            }

        }



}}