package com.example.leanr_android_java.buoi7

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Choreographer.FrameCallback
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.example.leanr_android_java.R

class Buoi7Activity : AppCompatActivity() {
    private var flFragment1:FrameLayout?= null
    private var flFragment2:FrameLayout?= null
    private var btnOpen: Button?=null
    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val intent = result.data?.extras?.getInt("aaa")
            Toast.makeText(this, "ok",Toast.LENGTH_SHORT).show()
            // Handle the Intent
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buoi7)
        flFragment1= findViewById(R.id.flFragment1)
        btnOpen= findViewById(R.id.btnOpen)
        openManMoi()
        val fragment1=Buoi7Fragment.newFragment("NEW DATA")

//        flFragment2= findViewById(R.id.flFragment2)

        val fragmentManager=supportFragmentManager
        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.flFragment1,fragment1).commit()
//        fragmentTransaction.add(R.id.flFragment2,fragment2).commit()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
    //khi app xuong backgroud(can luu lai 1 so du lieu gi do)
    //khi app tu backgroud den foreground no hien tri luon
    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }
    //remove ,clear 1 so observe 1 so luong call api dang do, 1 so su kien
    //tiet kiem bo nhom, tranh leak memory

    override fun onDestroy() {
        super.onDestroy()
    }
    fun toastLinhTinh(){
        Toast.makeText(this,"hihi",Toast.LENGTH_SHORT).show()
    }
    private fun openManMoi(){
        btnOpen?.setOnClickListener {
            val intent = Intent(this,Buoi7BarActivity::class.java);
            intent.putExtra("key1",10)
            intent.putExtra("key2","TOI LA DO TUAN DAT")

            val data = SevenClass().apply {
                this.title="Buoi7"
                this.content="B7"
            }
            intent.putExtra("key3",data)
            startActivity(intent)
            startForResult.launch(intent)

        }
    }
}