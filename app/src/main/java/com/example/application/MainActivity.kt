package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.Collections.swap

class MainActivity : AppCompatActivity() {
    val dol: Float= 1F
    val rub: Float = 74.0F
    val eu: Float = 0.89F
    val pound: Float = 0.8F
    val griv: Float = 27F
    var sub: Float = 74F
    var to: Float = 1F



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1(view: View) {

        val textView: TextView = findViewById<TextView>(R.id.textView2)
        val textView2: TextView = findViewById<TextView>(R.id.textView1)
        var str: String = textView2.text.toString()
        var ans: Float = str.toFloat()
        ans=ans/sub*to
        str=ans.toString()
        textView.setText(str)
    }
    fun button2(view: View) {

        val textView: TextView = findViewById<TextView>(R.id.input)
        val textView2: TextView = findViewById<TextView>(R.id.output)
        val str: String=textView.text.toString()
        val str2: String=textView2.text.toString()
        textView.setText(str2)
        textView2.setText(str)
        val t: Float= sub
        sub=to
        to=t
    }

    fun button3(view: View) {
        val textView2: TextView = findViewById<TextView>(R.id.output)
        textView2.setText("Рубли")
        to=rub
    }
    fun button4(view: View) {
        val textView2: TextView = findViewById<TextView>(R.id.output)
        textView2.setText("Доллары")
        to=dol
    }
    fun button5(view: View) {
        val textView2: TextView = findViewById<TextView>(R.id.output)
        textView2.setText("Евро")
        to=eu
    }
    fun button6(view: View) {
        val textView2: TextView = findViewById<TextView>(R.id.output)
        textView2.setText("Фунты")
        to=pound
    }
    fun button7(view: View) {
        val textView2: TextView = findViewById<TextView>(R.id.output)
        textView2.setText("Гривны")
        to=griv
    }
    fun button8(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.input)
        textView.setText("Рубли")
        sub=rub
    }
    fun button9(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.input)
        textView.setText("Доллары")
        sub=dol
    }
    fun button10(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.input)
        textView.setText("Евро")
        sub=eu
    }
    fun button11(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.input)
        textView.setText("Фунты")
        sub=pound
    }
    fun button12(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.input)
        textView.setText("Гривны")
        sub=griv
    }


}
