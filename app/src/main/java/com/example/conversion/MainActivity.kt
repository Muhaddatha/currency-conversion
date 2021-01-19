package com.example.conversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //R for resources
    } //end Oncreate: life cycle method that starts the whole process

    //convert the currency function
    fun convertCurrency(view: View){
        //View is the parent class of all the controls like buttons, sliders, etc.

        val dollarText = findViewById<EditText>(R.id.dollarText) //getting the numberDecimal element
        //'val' makes it a constant

        var outputTV = findViewById<TextView>(R.id.textView2)

        if(dollarText.text.isNotEmpty()){

            val dollarValue = dollarText.text.toString().toFloat()

            val euroValue = dollarValue * 0.85f //'f' is for float

            //calling the textview
            outputTV.text = euroValue.toString()
        }
        else{
            outputTV.text = getString(R.string.no_value_string)

        }
    }
}