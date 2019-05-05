package com.example.ege.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtResult = findViewById(R.id.txtordersum);
        String resultPrice = "" + getIntent().getDoubleExtra("Result",0.0);
        txtResult.setText("Check: " + resultPrice);




    }
}
