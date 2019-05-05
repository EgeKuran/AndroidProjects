package edu.sabanciuniv.activittransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int NUMBER_ENTERED = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gotoNumberActivity(View v){

        Intent i = new Intent(this,NumberActivity.class);
        startActivityForResult(i,NUMBER_ENTERED);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode ==NUMBER_ENTERED) {

            if(resultCode == RESULT_OK){
                ((TextView)findViewById(R.id.txtNum)).setText(
                        String.valueOf(data.getExtras().getInt("num"))
                );
            }
        }
        }
    }
