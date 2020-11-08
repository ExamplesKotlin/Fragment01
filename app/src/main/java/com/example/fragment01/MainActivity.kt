package com.example.fragment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.fragment01.fragment.BlankFragment
import com.example.fragment01.fragment.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager


        btnAddFA.setOnClickListener {
            val fragment = BlankFragment()
            val transaction = manager.beginTransaction()
            transaction.add(R.id.container, fragment, "BlankFragment")
            transaction.commit()
        }

        btnDelFA.setOnClickListener {
            val fragment = manager.findFragmentByTag("BlankFragment")
            val transaction = manager.beginTransaction()

            if (fragment != null) {
                transaction.remove(fragment)
                transaction.commit()
            } else {
//                Toast.makeText(this, "Fragment BlankFragment Not Found", Toast.LENGTH_SHORT).show()
                showMessage("Fragment BlankFragment (A) Not Found")
            }
        }

        btnAddFB.setOnClickListener {
            val fragment = SecondFragment()
            val transaction = manager.beginTransaction()
            transaction.add(R.id.container, fragment, "SecondFragment")
            transaction.commit()
        }

        btnDelFB.setOnClickListener {
            val fragment = manager.findFragmentByTag("SecondFragment")
            val transaction = manager.beginTransaction()

            if (fragment != null) {
                transaction.remove(fragment)
                transaction.commit()
            } else {
//                Toast.makeText(this, "Fragment SecondFragment Not Found", Toast.LENGTH_SHORT).show()
                showMessage("Fragment SecondFragment (B) Not Found")
            }
        }

        btnReplacexA.setOnClickListener {
            val fragmet = BlankFragment()
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.container, fragmet, "BlankFragment")
            transaction.commit()
        }

        btnReplacexB.setOnClickListener {
            val fragmet = SecondFragment()
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.container, fragmet, "SecondFragment")
            transaction.commit()
        }

    }
}
