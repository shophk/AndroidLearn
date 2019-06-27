package com.mw.kotlinshared1_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.kotlin.mpp.mobile.createApplicationScreenMessage
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       findViewById<TextView>(R.id.the_message).text = createApplicationScreenMessage()
    }
}
