package com.example.leanr_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.leanr_android_java.btvn5.UpdateUseActivity;
import com.example.leanr_android_java.buoi4.GridActivity;
import com.example.leanr_android_java.buoi4.HorizontalActivity;
import com.example.leanr_android_java.buoi5.KotlinActivity;
import com.example.leanr_android_java.buoi6.Buoi6Activity;
import com.example.leanr_android_java.buoi7.Buoi7Activity;
import com.example.leanr_android_java.recycleview.MainActivity5;

public class MainActivity extends AppCompatActivity {
    private Button btn2;
    private Button btn3;
    private Button btn1;
    private Button btn7;

    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1 = findViewById(R.id.btn1);
        btn7 = findViewById(R.id.btnBuoi7);
        btn1.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(this, HorizontalActivity.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(view ->{
            Intent intent = new Intent(this, Buoi6Activity.class);
            startActivity(intent);
        });
        btn7.setOnClickListener(view->{
            Intent intent = new Intent(this, Buoi7Activity.class);
            startActivity(intent);
        });
        findViewById(R.id.btnKotlin).setOnClickListener(v->{
            startActivity(new Intent(this, UpdateUseActivity.class));
        });
    }

}