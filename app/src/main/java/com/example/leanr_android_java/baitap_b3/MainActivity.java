package com.example.leanr_android_java.baitap_b3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.leanr_android_java.MainActivity2;
import com.example.leanr_android_java.R;
import com.example.leanr_android_java.recycleview.MainActivity5;

public class MainActivity extends AppCompatActivity {
    private String passInput="";
    private String passInputAgain="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtPass= findViewById(R.id.edtPass);
        EditText edtPassAgain= findViewById(R.id.edtPassAgain);
        TextView tvError= findViewById(R.id.tvError);
        TextView tieptuc = findViewById(R.id.tieptuc);

        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String name = s.toString().trim();
                if(name.length()<6){
                    edtName.setError("ten tai khoan toi thieu 6 ki tu");
                }else{
                    edtName.setError(null);
                }
            }
        });
        edtPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String pass = s.toString().trim();
                if(pass.length()<8){
                    edtPass.setError("mat khau toi thieu 8 ki tu");
                }else{
                    edtPass.setError(null);
                }
                passInput=s.toString().trim();

            }
        });
        edtPassAgain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String passAgain= s.toString().trim();

                passInputAgain=s.toString().trim();
                if(passInput.equals(passInputAgain)){
                    tvError.setText("mat khau hop le");
                    tvError.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.shape_edittext));
                }else{
                    tvError.setText("Mat khau khong trung khop");
                    tvError.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.shape_edittext));
                }
            }
        });
        tieptuc.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
    }
}