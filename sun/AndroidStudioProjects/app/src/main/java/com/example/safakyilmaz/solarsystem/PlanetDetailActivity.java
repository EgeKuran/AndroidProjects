package com.example.safakyilmaz.solarsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetDetailActivity extends AppCompatActivity {

    Planet planet;
    ImageView img;
    TextView txtdata;
    TextView txtcat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        this.planet=(Planet)getIntent().getExtras().getSerializable("planet");
        img=findViewById(R.id.imgBigPlanet);
        txtdata=findViewById(R.id.txtData);
        txtcat=findViewById(R.id.txtCat);

        img.setImageResource(planet.getImg());
        txtdata.setText(planet.getDescription());
        txtcat.setText(planet.getCategory());


        getSupportActionBar().setTitle(planet.getName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(android.R.drawable.ic_media_previous);






    }
}
