package com.example.ranun_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("Verbose", "testing v")
        Log.d("Debug", "Debug testing") //개발자 많이 사용
        Log.i("info", "info v")
        Log.w("warn", "warn v")
        Log.e("error", "error v")

    }
}
