package com.example.myapplication

import android.content.Context
import android.widget.Toast


class ClassSomeWork(private val context: Context) {
    fun printToast() = Toast.makeText(context, "hello", Toast.LENGTH_LONG).show()

}