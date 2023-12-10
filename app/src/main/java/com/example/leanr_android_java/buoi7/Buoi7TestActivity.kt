package com.example.leanr_android_java.buoi7

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.leanr_android_java.R

class Buoi7TestActivity : AppCompatActivity() {
    private var tvShowData:TextView?=null
    private var btnBack:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buoi7_test)
        tvShowData= findViewById(R.id.tvShowData)
        btnBack = findViewById(R.id.btnBack)
        //nhan du lieu
//        val so = intent.extras?.getInt("key1")
        val so = intent.extras?.getInt("key1",-1)
        val text = intent.extras?.getString("key2","")
        val data = intent.extras?.get("key3") as? SevenClass
        tvShowData?.text="$so, $text ${data?.title}"
        btnBack?.setOnClickListener {
            val intent = Intent()
            intent.putExtra("aaa",2)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}