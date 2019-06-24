package com.example.scrolltextview.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"

        rollButton.setOnClickListener {
            Toast.makeText(this, "ROLLING IT", Toast.LENGTH_SHORT).show()
        }


    }
}
