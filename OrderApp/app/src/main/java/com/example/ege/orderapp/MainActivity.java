package com.example.ege.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    List<ProductItem> itemList = ProductItem.getProductList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
    }

    public void addItem(View v) {
        final ItemView itemView = new ItemView(this);

        itemView.setListener(new ItemView.ItemViewListener() {
            @Override
            public void exitClicked() {
                Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
                container.removeView(itemView);

            }
        });

        container.addView(itemView);

        Toast.makeText(MainActivity.this, "Item Added", Toast.LENGTH_SHORT).show();


        ArrayAdapter<Object> adp = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, itemList.toArray());
        itemView.getSpnItem().setAdapter(adp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ItemView it;
        Double result;
        result = 0.;
        for(int i=0;i< container.getChildCount();i++)
         {
             it =(ItemView) container.getChildAt(i);
             int quantity = Integer.parseInt(it.getEditText().getText().toString());
             String orderedItem =it.getSpnItem().getSelectedItem().toString();
             ProductItem listItem =itemList.get(i);
            if(orderedItem.equals(listItem.toString()))
            {
                result += (quantity*listItem.getUnitPrice());
            }

         }

        Intent i = new Intent(this,ResultActivity.class);
        i.putExtra("Result",result);
        startActivity(i);


        return true;
    }
}
