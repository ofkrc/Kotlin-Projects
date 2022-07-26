package com.omerkaraca.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Ömer",23)


        println(myUser.age.toString())
        println(myUser.name)


    }
}