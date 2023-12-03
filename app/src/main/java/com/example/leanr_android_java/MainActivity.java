package com.example.leanr_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnClickMe;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = findViewById(R.id.btnClickMe);
        tvName = findViewById(R.id.tvName);
        int position = 0; //kieu so nguyen khong co truonghop null
        Integer index = null; // co truong hop null(de xay ra crash)
        btnClickMe.setOnClickListener(view -> {
            tvName.setText("Tuan Dat dang hoc android");
            //Khi bam man hinh mo ra man hinh so 2
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        });

    }
}