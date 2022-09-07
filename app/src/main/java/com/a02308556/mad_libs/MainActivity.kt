package com.a02308556.mad_libs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        val noun_label = TextView(this)
        noun_label.text = "Noun"
        val adjectiveLable1 = TextView(this)
        adjectiveLable1.text = "Adjective"

        val adjectiveLable2 = TextView(this)
        adjectiveLable2.text = "Adjective"

        val adjectiveLable3 = TextView(this)
        adjectiveLable3.text = "Adjective"

        val adjectiveLable4 = TextView(this)
        adjectiveLable4.text = "Adjective"


        val noun = EditText(this)
        val adjective1 = EditText(this)
        val adjective2 = EditText(this)
        val adjective3 = EditText(this)
        val adjective4 = EditText(this)
        val button = Button(this)
        val output = TextView(this)

        button.text = "Mad Lib"
        button.setOnClickListener {
            val sandSpeech = "I don't like ${noun.text}. It's ${adjective1.text} and ${adjective2.text}" +
                             " and ${adjective3.text} and it gets ${adjective4.text}." +
                             "\"Then he runs his hand up Padme's back.\""
            output.text = sandSpeech
        }
        layout.addView(noun_label)
        layout.addView(noun)

        layout.addView(adjectiveLable1)
        layout.addView(adjective1)
        layout.addView(adjectiveLable2)
        layout.addView(adjective2)
        layout.addView(adjectiveLable3)
        layout.addView(adjective3)
        layout.addView(adjectiveLable4)
        layout.addView(adjective4)

        layout.addView(button)
        layout.addView(output)

        setContentView(layout)
    }

}

