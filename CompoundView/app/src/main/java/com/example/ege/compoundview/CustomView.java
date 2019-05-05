package com.example.ege.compoundview;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class CustomView extends LinearLayout{

    public void setListener(CustomViewListener listener) {
        this.listener = listener;
    }

    interface CustomViewListener
    {
       void buttonClicked(String text);

    }
    CustomViewListener listener;
    EditText txtData;
    Button btnOk;

    public CustomView(Context context) {
        super(context);
        
        inflate(context, R.layout.compviewlayout,this);
        txtData=findViewById(R.id.txtdata);
        btnOk=findViewById(R.id.btnok);
        btnOk.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               listener.buttonClicked(txtData.getText().toString());
            }
        });
    }
}
