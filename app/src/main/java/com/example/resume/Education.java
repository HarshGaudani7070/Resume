package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Education extends AppCompatActivity {

    EditText degree,school,grade,year;
    String deg,sc,gr,ye;
    Button next,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        degree = findViewById(R.id.degree);
        school = findViewById(R.id.school);
        grade = findViewById(R.id.grade);
        year =  findViewById(R.id.year);
        next =  findViewById(R.id.next);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                degree.setText("");
                school.setText("");
                grade.setText("");
                year.setText("");

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                deg = degree.getText().toString();
                sc = school.getText().toString();
                gr = grade.getText().toString();
                ye = year.getText().toString();

                Intent intent =  new Intent(Education.this,Education.class);
                finish();
                startActivity(intent);
            }
        });
    }
}

