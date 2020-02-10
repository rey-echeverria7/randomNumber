package com.example.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var counter: Int = 0
    var num:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etiqueta: TextView = findViewById(R.id.etiqueta) as TextView
        val down: Button = findViewById(R.id.down) as Button
        val up: Button = findViewById(R.id.up) as Button
        val generate: Button = findViewById(R.id.generate) as Button

        generate.setOnClickListener{
            num = Random.nextInt(0,100)
             etiqueta.setText(""+num+"")
        }

    }
}
