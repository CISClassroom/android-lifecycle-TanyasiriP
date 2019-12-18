package com.cis.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page2.*

class Page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        button2.setOnClickListener{
            //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT.show())
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}
