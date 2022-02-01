package com.nandini.android.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class LoginDetailsActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA="name_extra"
        const val PASS="password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_details)


val name=intent.getStringExtra(NAME_EXTRA)
        val pass= intent.getStringExtra(PASS)
val summary=findViewById<TextView>(R.id.summary)
        summary.setText(" LoginCode : 45434223\n" +
                        " Email Id  : anandini@gmail.com\n" +
                        " Username  : $name\n" +
                        " Password  : $pass\n")


    }
}