package com.example.ege.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v)
    {
        Intent i = new Intent(this,SecondActivity.class);

        if(v.getId()==R.id.btnTemp){


             i.putExtra("EXTRA_MESSAGE","Temperature Converter");
                }

        if(v.getId()==R.id.btnMass)
            { i.putExtra("EXTRA_MESSAGE","Mass Converter");}

         if(v.getId()==R.id.btnLength)
            {  i.putExtra("EXTRA_MESSAGE","Length Converter");}
        startActivity(i);


        }
    }

