package edu.uw.ischool.uw2065357.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var clickCount = 0
    private lateinit var myButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton = findViewById<Button>(R.id.button)
        myButton.text = resources.getString(R.string.button_label_default)
    }

    //Take a View Attribute of Type view
    //added question mark to accept null
    fun buttonClickerCounter(view:View?){
        clickCount++

        myButton.text = if(clickCount == 1){
            resources.getString(R.string.button_label_first_click)
        }else {
            resources.getString(R.string.button_label_multi_clicks, clickCount)
        }


    }
}