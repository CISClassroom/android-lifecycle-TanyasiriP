package com.cis.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Log.i("onClick","Activity created")

        button1.setOnClickListener{
            //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT.show())
            var i = Intent(this,Page2::class.java)
            startActivity(i)
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Nice to see ya, boi!!!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
    override fun onResume() {
        super.onResume()
        Log.i("onResume","Activity resume")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.action_settings -> {
                Toast.makeText(this,"Menu Click", Toast.LENGTH_SHORT)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
