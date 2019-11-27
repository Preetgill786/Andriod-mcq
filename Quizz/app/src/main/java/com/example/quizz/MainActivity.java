package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
EditText etresult;
RadioGroup rg1,rg2,rg3,rg4,rg5;
//RadioButton rbop1,rbop2,rbop3,rbop21,rbop22,rbop23,rbop31,rbop32,rbop33,rbop41,rbop42,rbop43,rbop51,rbop52,rbop53;
Button btnSubmit;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etresult = findViewById(R.id.result);
        rg1 = findViewById(R.id.radio1);
        rg2 = findViewById(R.id.radio2);
        rg3 = findViewById(R.id.radio3);
        rg4 = findViewById(R.id.radio4);
        rg5 = findViewById(R.id.radio5);

        btnSubmit = findViewById(R.id.submit);
//correct answers
//        rbop1 = findViewById(R.id.op1);
//        rbop22 = findViewById(R.id.op2_2);
//        rbop33 = findViewById(R.id.op3_3);
//        rbop41 = findViewById(R.id.op4_1);
//        rbop51 = findViewById(R.id.op5_1);

        rg1.setOnCheckedChangeListener(this);
        rg2.setOnCheckedChangeListener(this);
        rg3.setOnCheckedChangeListener(this);
        rg4.setOnCheckedChangeListener(this);
        rg5.setOnCheckedChangeListener(this);



    btnSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            etresult.setText(result+"");
        }
    });
}

    @Override
    public void onCheckedChanged(RadioGroup rg, int id) {
        if(rg.getId() == R.id.radio1){

            if (id== R.id.op1)
                result+=10;
        }
        else if(rg.getId() == R.id.radio2){


            if (id == R.id.op2_2)
                result += 10;
        }

        else if (rg.getId() == R.id.radio3){

            if (id == R.id.op3_3)
                result += 10;
        }
        else if (rg.getId() == R.id.radio4){

            if (id == R.id.op4_1)
                result += 10;
        }
        else if (rg.getId() == R.id.radio5) {
            {
                if (id == R.id.op5_1)
                    result += 10;
            }

        } }
}





