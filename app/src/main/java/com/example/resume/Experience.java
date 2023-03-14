package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Experience extends AppCompatActivity {

    EditText Company,job,year;
    String Companyname,joblittle,exyear;
    Button reset, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        Company = findViewById(R.id.company);
        job = findViewById(R.id.job);
        year = findViewById(R.id.year);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Company.setText("");
                job.setText("");
                year.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Companyname = Company.getText().toString();
                joblittle = job.getText().toString();
                exyear = year.getText().toString();


                Intent intent = new Intent(Experience.this,Skill.class);
                finish();
                startActivity(intent);

            }
        });

    }
}

