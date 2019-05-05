package com.example.safakyilmaz.solarsystem;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by safakyilmaz on 19.04.2018.
 */

public class PlanetsAdapter extends ArrayAdapter<Planet>{


    public PlanetsAdapter(@NonNull Context context, @NonNull List<Planet> objects) {
        super(context, android.R.layout.simple_spinner_dropdown_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        PlanetViewHolder viewHolder=null;

        if(row==null){

          LayoutInflater inflater=((Activity)getContext()).getLayoutInflater();

          row=inflater.inflate(R.layout.planet_row_layout,parent,false);
          viewHolder=new PlanetViewHolder(row);
          row.setTag(viewHolder);

        }else{
           viewHolder= (PlanetViewHolder)row.getTag();
        }


        viewHolder.getImgPlanet().setImageResource(getItem(position).getImg());
        viewHolder.getTxtPlanetCat().setText(getItem(position).getCategory());
        viewHolder.getTxtPlanetName().setText(getItem(position).getName());


        return row;

    }



    class PlanetViewHolder{



        View base;
        ImageView imgPlanet;
        TextView txtPlanetName;
        TextView txtPlanetCat;

        public PlanetViewHolder(View base){
            this.base=base;
        }

        public ImageView getImgPlanet(){

            if(imgPlanet==null){
                imgPlanet=base.findViewById(R.id.implanet);
            }
            return imgPlanet;

        }

        public TextView getTxtPlanetCat(){
            if(txtPlanetCat==null){
                txtPlanetCat=base.findViewById(R.id.txtPlanetCat);
            }
            return txtPlanetCat;
        }

        public TextView getTxtPlanetName(){
            if(txtPlanetName==null){
                txtPlanetName=base.findViewById(R.id.txtPlanetName);
            }
            return  txtPlanetName;
        }
















    }





}
