package edu.sabanciuniv.spinnerexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spCities;
    Spinner spPeople;
    Spinner spCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.cities));

        spCities = findViewById(R.id.spcities);
        spCities.setAdapter(adp);

        spCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] cities =  getResources().getStringArray(R.array.cities);
                Toast.makeText(MainActivity.this,cities[i],Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spPeople = findViewById(R.id.spPeople);

        ArrayAdapter<Person> adp2 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
               Person.getPeople());

        spPeople.setAdapter(adp2);


        spPeople.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,Person.getPeople().get(i).toString(),Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spCustom = findViewById(R.id.spCustom);

        ArrayAdapter<String> adp3 = new ArrayAdapter<String>(this,R.layout.myspinnerlayout,
                R.id.splabel,
                getResources().getStringArray(R.array.cities));
        spCustom.setAdapter(adp3);
    }
}
