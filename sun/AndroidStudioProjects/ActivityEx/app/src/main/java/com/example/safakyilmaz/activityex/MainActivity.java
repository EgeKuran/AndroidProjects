package com.example.safakyilmaz.activityex;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {


    EditText txtInput;
    Button btnOk;
    TextView txtOut;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activty_layout);

        txtInput= findViewById(R.id.txtinput);
        txtOut=findViewById(R.id.txtText);




    }

    public void clickButton(View v){

        txtOut.setText(txtInput.getText().toString());




    }



}
