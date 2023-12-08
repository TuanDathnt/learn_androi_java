package com.example.leanr_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private EditText edtText;
    private CheckBox cbCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edtText = findViewById(R.id.edit1);
        cbCheck = findViewById(R.id.cbCheck);

        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        cbCheck.isChecked();
        cbCheck.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(buttonView.isChecked()){
                Toast.makeText(MainActivity4.this,"Ban Da tich",Toast.LENGTH_SHORT).show();
            }
        });
    }
}