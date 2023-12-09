package com.example.leanr_android_java.buoi6

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.leanr_android_java.R
import com.example.leanr_android_java.recycleview.Student

fun tinhTong(a:Int,b:Int):Int{
    return a+b
}
class Buoi6Activity : AppCompatActivity() {
    private var print :(() -> Unit)= {
        Toast.makeText(this,"HIHI",Toast.LENGTH_SHORT).show();
    }
    private var print2:((String) -> Unit)={
        Toast.makeText(this,it,Toast.LENGTH_SHORT).show();
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buoi6)
        print2.invoke("Toi la Tuan Dat")
        val rcvData = findViewById<RecyclerView>(R.id.rcvData);
        val adapter=StudentKotlinAdapter(createStudentList())
        adapter.onClickItem={
            goiApiTinhABC{
                Toast.makeText(this,it,Toast.LENGTH_SHORT).show();
            }

        }
        rcvData.adapter =adapter
        val chat = Chat().apply {
            this.image= R.drawable.ic_food.toString()
            this.name = "Do Tuan Dat"
            this.message="HELloo bro"
        }
    }
    private fun goiApiTinhABC(callback: ((String)->Unit)){
        tinhTong(1,2);
        callback.invoke("Thanh cong");

    }
//    fun ten_doi_Tuong.ten_ham(tham so truyen vao){
//
//    }
    private fun createStudentList(): List<Student> {
        val studentList: MutableList<Student> = ArrayList()
        studentList.add(Student("Duong", 20, "1", "Pt"))
        studentList.add(Student("Duong1", 20, "2", "Pt"))
        studentList.add(Student("Duong2", 20, "3", "Pt"))
        studentList.add(Student("Duong3", 20, "4", "Pt"))
        studentList.add(Student("Duong4", 20, "5", "Pt"))
        studentList.add(Student("Duong5", 20, "6", "Pt"))
        studentList.add(Student("Duong6", 20, "7", "Pt"))
        studentList.add(Student("Duong7", 20, "8", "Pt"))
        studentList.add(Student("Duongs8", 20, "9", "Pt"))
        studentList.add(Student("Duong9", 20, "10", "Pt"))
        studentList.add(Student("Duongd0", 20, "11", "Pt"))
        studentList.add(Student("Duong1d22", 20, "12", "Pt"))
        studentList.add(Student("Duong122", 20, "13", "Pt"))
        studentList.add(Student("Duong313", 20, "14", "Pt"))
        studentList.add(Student("Duong9", 20, "10", "Pt"))
        studentList.add(Student("Duong04", 20, "11", "Pt"))
        studentList.add(Student("Duong132", 20, "12", "Pt"))
        studentList.add(Student("Duong222", 20, "13", "Pt"))
        studentList.add(Student("Duong33", 20, "14", "Pt"))
        studentList.add(Student("Duong9", 20, "10", "Pt"))
        studentList.add(Student("Duong10", 20, "11", "Pt"))
        studentList.add(Student("Duong12", 20, "12", "Pt"))
        studentList.add(Student("Duong22", 20, "13", "Pt"))
        studentList.add(Student("Duong331", 20, "14", "Pt"))
        studentList.add(Student("Duong9", 20, "10", "Pt"))
        studentList.add(Student("Duong0", 20, "11", "Pt"))
        studentList.add(Student("Duong12", 20, "12", "Pt"))
        studentList.add(Student("Duong22", 20, "13", "Pt"))
        studentList.add(Student("Duong33", 20, "14", "Pt"))
        return studentList
    }
}