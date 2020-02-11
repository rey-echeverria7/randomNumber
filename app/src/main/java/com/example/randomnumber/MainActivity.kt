package com.example.randomnumber
import android.media.MediaPlayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var counter: Int = 0
    var num:Int = 0
    var auxa: Int = 100
    var auxb: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mp: MediaPlayer

        val etiqueta: TextView = findViewById(R.id.etiqueta) as TextView
        val down: Button = findViewById(R.id.down) as Button
        down.isEnabled = false
        val up: Button = findViewById(R.id.up) as Button
        up.isEnabled = false
        val generate: Button = findViewById(R.id.generate) as Button

        val correcto:Button = findViewById(R.id.correcto)as Button
        mp=MediaPlayer.create(this,R.raw.posty)
        generate.setOnClickListener{

                num = Random.nextInt(0,100)
                etiqueta.setText(""+num+"")

                up.isEnabled = true
                down.isEnabled = true

        }

        up.setOnClickListener{

            auxb = num

            num = Random.nextInt(auxb,auxa)
            etiqueta.setText(""+num+"")


        }

        down.setOnClickListener{
            auxa = num

            num = Random.nextInt(auxb,auxa)
             etiqueta.setText(""+num+"")
        }

        correcto.setOnClickListener{
            mp.start()
            up.isEnabled=false
            down.isEnabled = false
            num = 0
            etiqueta.setText("$num")
            auxa = 100
            auxb=0

        }


    }
}
