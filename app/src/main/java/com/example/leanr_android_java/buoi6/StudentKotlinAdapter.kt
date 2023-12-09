package com.example.leanr_android_java.buoi6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leanr_android_java.R
import com.example.leanr_android_java.recycleview.Student

class StudentKotlinAdapter(val studentList: List<Student>) :RecyclerView.Adapter<StudentKotlinAdapter.StudentVH>() {
    class StudentVH(view: View): RecyclerView.ViewHolder(view){
        private var tvName:TextView= view.findViewById<TextView>(R.id.tvName)
        private var tvAge:TextView= view.findViewById<TextView>(R.id.tvAge)
        fun setData(student: Student){
            tvName.text = student.name
            tvAge.text = "${student.age}"
        }
    }
    var onClickItem:((Student) ->Unit)? = null;


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false);
        return StudentVH(view);

    }

    override fun getItemCount(): Int = if (studentList.isNotEmpty()) studentList.size else 0

    override fun onBindViewHolder(holder: StudentVH, position: Int) {

        holder.setData(studentList[position])
        holder.itemView.setOnClickListener {
            onClickItem?.invoke(studentList[position])
        }
    }
}