package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText result;
RadioGroup rg1,rg2,rg3,rg4,rg5;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        rg1 = findViewById(R.id.radio1);
        rg2 = findViewById(R.id.radio2);
        rg3 = findViewById(R.id.radio3);
        rg4 = findViewById(R.id.radio4);
        rg5 = findViewById(R.id.radio5);
        btnSubmit = findViewById(R.id.submit);
    }
}





