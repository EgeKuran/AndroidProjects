package com.example.ege.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        txtResult=findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String page = extras.getString("EXTRA_PAGE");
        String input = extras.getString("EXTRA_TEXTVALUE");
        String thirdTitle = extras.getString("EXTRA_SELECTED");
        this.setTitle(thirdTitle);
        double result=0;
        if(page.equals("Temperature Converter"))
        {
            if(thirdTitle.equals("Celcius to Fahrenheit")){result = (Double.parseDouble(input)) * 33.8;}

            else if (thirdTitle.equals("Fahrenheit to Celcius")){result = (Double.parseDouble(input))*-17.2222222;}
        }
        else if(page.equals("Mass Converter"))
        {
            if(thirdTitle.equals("Kilogram to Pound")){
                result =  (Double.parseDouble(input))* 2.20462262;

            }
            else if (thirdTitle.equals("Pound To Kilogram")){result = (Double.parseDouble(input))*0.45359237;}
        }
        else if(page.equals("Length Converter"))
        {
            if(thirdTitle.equals("Kilometer to Mile")){result = (Double.parseDouble(input)) *0.621371192;}
            else if (thirdTitle.equals("Mile to Kilometer")){result = (Double.parseDouble(input))*1.609344;}
        }

        txtResult.setText("Result: " + String.valueOf(result));

    }

    public void btnResetClick(View v)
    {
        Intent iRes= new Intent(ThirdActivity.this,MainActivity.class);
        iRes.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(iRes);

}
}
