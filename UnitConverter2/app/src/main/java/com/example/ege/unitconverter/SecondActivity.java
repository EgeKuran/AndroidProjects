package com.example.ege.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;




public class SecondActivity extends AppCompatActivity {
    Spinner spnConvert;
    String name;
    EditText txtValue;
    ArrayAdapter<CharSequence> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spnConvert = findViewById(R.id.spnconvert);
        txtValue=findViewById(R.id.txtvalue);
        name = getIntent().getStringExtra("EXTRA_MESSAGE");
        this.setTitle(name);

        if(name.equals("Temperature Converter"))
        {adp = new ArrayAdapter(this,  R.layout.myspinner_layout, this.getResources().getStringArray(R.array.temp_array));}
        else if(name.equals("Mass Converter"))
       {
            adp = new ArrayAdapter(this,  R.layout.myspinner_layout, this.getResources().getStringArray(R.array.mass_array));
        }
        else if(name.equals("Length Converter")) {
            adp = new ArrayAdapter(this,  R.layout.myspinner_layout, this.getResources().getStringArray(R.array.length_array));
        }

        spnConvert.setAdapter(adp);

    }

    public void btnCompClick(View v) {
        Intent iComp = new Intent(this, ThirdActivity.class);
        String spinnerSelected= spnConvert.getSelectedItem().toString();

        Bundle extras = new Bundle();
        extras.putString("EXTRA_PAGE",name);

        extras.putString("EXTRA_TEXTVALUE",txtValue.getText().toString());
        extras.putString("EXTRA_SELECTED",spinnerSelected);

        iComp.putExtras(extras);
        startActivity(iComp);
    }

}
