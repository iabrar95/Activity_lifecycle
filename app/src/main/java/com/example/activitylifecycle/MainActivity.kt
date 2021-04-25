package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var plus = findViewById<Button>(R.id.button)
        var mins = findViewById<Button>(R.id.button2)
        var number = findViewById<TextView>(R.id.textView)
        number.text = num.toString()
        plus.setOnClickListener { num++
            number.text = num.toString()}
        mins.setOnClickListener { num--
            number.text = num.toString()}

        var newActivity = findViewById<Button>(R.id.button3)
        newActivity.setOnClickListener {  val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)}


        Log.i("onCreate","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy","onDestroy")
    }
}
