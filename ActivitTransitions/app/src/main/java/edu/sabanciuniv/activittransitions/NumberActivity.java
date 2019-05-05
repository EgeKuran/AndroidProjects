package edu.sabanciuniv.activittransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NumberActivity extends AppCompatActivity {

    EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        txtInput = findViewById(R.id.txtNumInput);
    }

    public void numberedEntered(View v){

        int num = Integer.valueOf(txtInput.getText().toString());
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("num",num);
        setResult(RESULT_OK,i);
        finish();


    }

    public void cancel(View v){

        setResult(RESULT_CANCELED);
        finish();

    }
}
