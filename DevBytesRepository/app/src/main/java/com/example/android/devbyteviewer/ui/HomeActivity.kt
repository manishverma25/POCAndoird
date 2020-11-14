package com.example.android.devbyteviewer.ui

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.android.devbyteviewer.R

class HomeActivity : AppCompatActivity() {

    var frag  =FirstFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            supportFragmentManager.beginTransaction().add(R.id.fragment_container_view_tag,frag).commit()


        }
    }


    override fun onBackPressed() {
        if(frag.onBackPress()){
            //

            Log.d("mvv","do nothing ")
        }else {
            super.onBackPressed()
        }



    }
}