package com.example.davaleba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var randomNumber1: EditText
    lateinit var randomNumber2: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mult: Button
    lateinit var div: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomNumber1 = findViewById(R.id.randomNumber1)
        randomNumber2 = findViewById(R.id.randomNumber2)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mult = findViewById(R.id.mult)
        div = findViewById(R.id.div)



        add.setOnClickListener {

            val res1 = randomNumber1.text.toString().toInt()
            val res2 = randomNumber2.text.toString().toInt()


            addition(res1,res2)
        }
        sub.setOnClickListener {

            val res1 = randomNumber1.text.toString().toInt()
            val res2 = randomNumber2.text.toString().toInt()


            substraction(res1,res2)
        }
        mult.setOnClickListener {

            val res1 = randomNumber1.text.toString().toInt()
            val res2 = randomNumber2.text.toString().toInt()


            multiplication(res1,res2)
        }
        div.setOnClickListener {

            val res1 = randomNumber1.text.toString().toInt()
            val res2 = randomNumber2.text.toString().toInt()


            division(res1,res2)
        }

    }

    private fun addition(res1: Int, res2: Int)
    {

        val result= res1+res2
        val intent = Intent(this, Results::class.java).also {
            it.putExtra("result", result.toString())
            startActivity(it)
        }

    }

    private fun substraction(res1: Int, res2: Int)
    {

        val result= res1-res2
        val intent = Intent(this, Results::class.java).also {
            it.putExtra("result", result.toString())
            startActivity(it)
        }
    }

    private fun multiplication(res1: Int, res2: Int)
    {

        val result= res1*res2
        val intent = Intent(this, Results::class.java).also {
            it.putExtra("result", result.toString())
            startActivity(it)
        }
    }

    private fun division(res1: Int, res2: Int)
    {

        val result= res1/res2
        val intent = Intent(this, Results::class.java).also {
            it.putExtra("result", result.toString())
            startActivity(it)
        }
    }

}