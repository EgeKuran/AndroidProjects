package com.example.ege.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container=findViewById(R.id.container);
    }


    public void addView(View v){

        CustomView cstView=new CustomView(this);


        cstView.setListener(new CustomView.CustomViewListener() {
            @Override
            public void buttonClicked(String text) {

                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });

        container.addView(cstView);

    }


}
