package com.developer.harshi.tinderforrecipes.VegOrNonVeg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.developer.harshi.tinderforrecipes.R;
import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.VegBreakfast;
import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.VegDinner;
import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.VegLunch;

/**
 * Created by Harshi on 7/7/2017.
 */

public class Vegetarian extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_eatingtime);

        ImageButton btnVegBreakfast,btnVegLunch,btnVegDinner;

        btnVegBreakfast = (ImageButton) findViewById(R.id.imageButtonVegBreakfast);
        btnVegLunch = (ImageButton) findViewById(R.id.imageButtonVegLunch);
        btnVegDinner = (ImageButton) findViewById(R.id.imageButtonVegDinner);

        btnVegBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Vegetarian.this,"You Have Selected Vegetarian Breakfast",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Vegetarian.this, VegBreakfast.class);
                startActivity(i);
            }
        });

        btnVegLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Vegetarian.this,"You Have Selected Vegetarian Lunch",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Vegetarian.this,VegLunch.class);
                startActivity(i);
            }
        });

        btnVegDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Vegetarian.this,"You Have Selected Vegetarian Dinner",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Vegetarian.this,VegDinner.class);
                startActivity(i);
            }
        });
    }
}
