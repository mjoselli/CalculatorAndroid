package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonAdd(view:View){
        val number1EditText = findViewById<EditText>(
            R.id.number1EditText)
        val num1 = number1EditText.text.toString().toInt()

        val num2 = findViewById<EditText>(
            R.id.number2EditText).text.toString().toInt()
        val result = num1+num2
        findViewById<TextView>(R.id.resultTextView)
            .setText(getString(R.string.result)+" $result")

    }

    fun buttonMinus(view:View){
        val number1EditText = findViewById<EditText>(
            R.id.number1EditText)
        val num1 = number1EditText.text.toString().toInt()

        val num2 = findViewById<EditText>(
            R.id.number2EditText).text.toString().toInt()
        val result = num1-num2

        findViewById<TextView>(R.id.resultTextView)
            .setText(getString(R.string.result)+" $result")

    }

    fun buttonMulti(view:View){
        val number1EditText = findViewById<EditText>(
            R.id.number1EditText)
        val num1 = number1EditText.text.toString().toInt()

        val num2 = findViewById<EditText>(
            R.id.number2EditText).text.toString().toInt()
        val result = num1*num2
        findViewById<TextView>(R.id.resultTextView)
            .setText(getString(R.string.result)+" $result")

    }

    fun buttonDiv(view:View){
        val number1EditText = findViewById<EditText>(
            R.id.number1EditText)
        val num1 = number1EditText.text.toString().toInt()

        val num2 = findViewById<EditText>(
            R.id.number2EditText).text.toString().toInt()
        if(num2 == 0){
            Toast.makeText(
                this,getString(R.string.error_div),
                Toast.LENGTH_SHORT
            ).show()
            return
        }
        val result = num1/num2
        findViewById<TextView>(R.id.resultTextView)
            .setText(getString(R.string.result)+" $result")

    }
}
