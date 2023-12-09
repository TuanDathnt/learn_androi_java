package com.example.leanr_android_java.btvn5

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.example.leanr_android_java.R
import com.example.leanr_android_java.buoi6.tinhTong
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class UpdateUseActivity : AppCompatActivity() {
    private var edtFullName: EditText? = null
    private var edtPhone:EditText?=null
    private var tvDate: TextView? =null
    private var btnUpdate : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_use)
        edtPhone = findViewById(R.id.edtPhone)
        edtFullName = findViewById(R.id.edtFullName)
        tvDate = findViewById(R.id.tvDate)
        btnUpdate = findViewById(R.id.btnUpdate)
        edtFullName?.addTextChangedListener{
            setEnableButton()
        }
        edtPhone?.addTextChangedListener{
            setEnableButton()
        }
        tvDate?.setOnClickListener{
            openChooseDate()
        }
        tinhTong(5,4)
        setEnableButton()
    }
    private fun setEnableButton(){
        btnUpdate?.isEnabled= isEnableButtonUpdate()
        if (isEnableButtonUpdate()){
            btnUpdate?.background = ContextCompat.getDrawable(this,R.drawable.bg_button)
            btnUpdate?.setTextColor(ContextCompat.getColor(this,R.color.white))

        }else{
            btnUpdate?.background = ContextCompat.getDrawable(this,R.drawable.bg_button_disable)
            btnUpdate?.setTextColor(ContextCompat.getColor(this,R.color.black))

        }
    }
    private fun openChooseDate(){
        val myCalender = Calendar.getInstance();
        val datePicker = DatePickerDialog.OnDateSetListener{view,year,month,dayofMonth->
            myCalender.set(Calendar.YEAR,year)
            myCalender.set(Calendar.MONTH,month)
            myCalender.set(Calendar.DAY_OF_MONTH,dayofMonth)
            updateLable(myCalender)
        }
        DatePickerDialog(this,datePicker,myCalender.get(Calendar.YEAR),myCalender.get(Calendar.MONTH),myCalender.get(Calendar.DAY_OF_MONTH)).show();

    }
    private fun updateLable(myCalendar: Calendar){
        val myFormat = "dd/MM/yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale("vi","VN"))
        tvDate?.text = sdf.format(myCalendar.time)
    }
    private fun isEnableButtonUpdate():Boolean{
        return edtFullName?.text.toString().trim().isNotEmpty() && edtPhone?.text.toString().trim().isNotEmpty() && tvDate?.text.toString().trim().isNotEmpty()
    }
}