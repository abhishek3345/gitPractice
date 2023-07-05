package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new changes in the file
        print("Hello world")
        val a:Int = 3;
        val b:Int = 8;
        add(a,b)
    }

    private fun add(a:Int,  b:Int) : Int {
        return a+b
    }
}
