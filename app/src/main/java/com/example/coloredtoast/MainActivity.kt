package com.example.coloredtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.btn)
        mButton.setOnClickListener {
            val mToast = Toast.makeText(this@MainActivity,"This is Toast..",Toast.LENGTH_LONG)
            val view = mToast.view
            view?.setBackgroundResource(R.drawable.toast_background)
            val mToastText = mToast.view?.findViewById<TextView>(android.R.id.message)
            mToastText?.setTextColor(Color.parseColor("#FFFFFF"))
            mToast.show()
        }
    }
}