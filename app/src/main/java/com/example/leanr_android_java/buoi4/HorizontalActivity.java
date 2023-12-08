package com.example.leanr_android_java.buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.leanr_android_java.R;
import com.example.leanr_android_java.recycleview.MainActivity5;
import com.example.leanr_android_java.recycleview.Student;
import com.example.leanr_android_java.recycleview.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class HorizontalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        RecyclerView rcvData = findViewById(R.id.rcvData);
        StudentAdapter adapter = new StudentAdapter(createStudentList());
        rcvData.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rcvData.setAdapter(adapter);
        adapter.setOnItemClick(new StudentAdapter.OnItemClick() {
            @Override
            public void clickName(String name) {
                Toast.makeText(HorizontalActivity.this,name,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void clickAge(String age) {

            }

            @Override
            public void clickItem() {
                Toast.makeText(HorizontalActivity.this,"day la item",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<Student> createStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Duong",20,"1","Pt"));
        studentList.add(new Student("Duong1",20,"2","Pt"));
        studentList.add(new Student("Duong2",20,"3","Pt"));
        studentList.add(new Student("Duong3",20,"4","Pt"));
        studentList.add(new Student("Duong4",20,"5","Pt"));
        studentList.add(new Student("Duong5",20,"6","Pt"));
        studentList.add(new Student("Duong6",20,"7","Pt"));
        studentList.add(new Student("Duong7",20,"8","Pt"));
        studentList.add(new Student("Duongs8",20,"9","Pt"));
        studentList.add(new Student("Duong9",20,"10","Pt"));
        studentList.add(new Student("Duongd0",20,"11","Pt"));
        studentList.add(new Student("Duong1d22",20,"12","Pt"));
        studentList.add(new Student("Duong122",20,"13","Pt"));
        studentList.add(new Student("Duong313",20,"14","Pt"));
        studentList.add(new Student("Duong9",20,"10","Pt"));
        studentList.add(new Student("Duong04",20,"11","Pt"));
        studentList.add(new Student("Duong132",20,"12","Pt"));
        studentList.add(new Student("Duong222",20,"13","Pt"));
        studentList.add(new Student("Duong33",20,"14","Pt"));
        studentList.add(new Student("Duong9",20,"10","Pt"));
        studentList.add(new Student("Duong10",20,"11","Pt"));
        studentList.add(new Student("Duong12",20,"12","Pt"));
        studentList.add(new Student("Duong22",20,"13","Pt"));
        studentList.add(new Student("Duong331",20,"14","Pt"));
        studentList.add(new Student("Duong9",20,"10","Pt"));
        studentList.add(new Student("Duong0",20,"11","Pt"));
        studentList.add(new Student("Duong12",20,"12","Pt"));
        studentList.add(new Student("Duong22",20,"13","Pt"));
        studentList.add(new Student("Duong33",20,"14","Pt"));
        return studentList;
    }}
