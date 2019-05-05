package com.example.safakyilmaz.solarsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstPlanets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPlanets=findViewById(R.id.lstPlanets);

        PlanetsAdapter adp=new PlanetsAdapter( this,Planet.getAllPlanets());

        lstPlanets.setAdapter(adp);

        lstPlanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i=new Intent(MainActivity.this,PlanetDetailActivity.class);
                Planet planet=Planet.getAllPlanets().get(position);
                i.putExtra("planet", planet);
                startActivity(i);
            }
        });



    }
}
