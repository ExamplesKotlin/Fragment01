package com.example.fragment01

import android.content.Context
import android.widget.Toast

fun Context.showMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}