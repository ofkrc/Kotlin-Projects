package com.omerkaraca.classandfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // mySum(6,4)
        val result = myMultiply(4,5)
        // textView.text= "Result: ${result}"

        val homer= Simpson( "homer simpson",50,"nuclear")
        // homer.age=50
        //homer.job="nuclear"
        //homer.name="homer simpson"
        println(homer.age)
    }


    fun mySum(a:Int,b:Int){
       // textView.text= "${a+b}"
    }

    fun myMultiply(x:Int,y:Int): Int{
        return x*y
    }

    fun makeSimpson(view: View){
        val name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if(age == null){
            age=0
        }
        val job = jobText.text.toString()

        val simpson = Simpson(name,age,job)

        resultText.text = "Name: ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"
    }


}