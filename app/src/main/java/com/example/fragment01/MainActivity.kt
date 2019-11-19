package com.example.fragment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = BlankFragment()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.container, fragment, "BlankFragment")
        transaction.commit()

    }
}
