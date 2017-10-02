package com.developer.harshi.tinderforrecipes.VegOrNonVeg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.NonvegBreakfast;
import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.NonvegDinner;
import com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner.NonvegLunch;
import com.developer.harshi.tinderforrecipes.R;

/**
 * Created by Harshi on 7/7/2017.
 */

public class NonVegetarian extends AppCompatActivity {

    ImageButton btnNonVegBreakfast,btnNonVegLunch,btnNonVegDinner;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonveg_eatingtime);

        btnNonVegBreakfast = (ImageButton) findViewById(R.id.imageButtonNonVegBreakfast);
        btnNonVegLunch = (ImageButton) findViewById(R.id.imageButtonNonVegLunch);
        btnNonVegDinner = (ImageButton) findViewById(R.id.imageButtonNonVegDinner);

        btnNonVegBreakfast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(NonVegetarian.this,"You Have Selected Non-Vegetarian Breakfast",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(NonVegetarian.this,NonvegBreakfast.class);
                    startActivity(i);
                }
            });

        btnNonVegLunch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(NonVegetarian.this,"You Have Selected Non-Vegetarian Lunch",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(NonVegetarian.this,NonvegLunch.class);
                    startActivity(i);
                }
            });

        btnNonVegDinner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(NonVegetarian.this,"You Have Selected Non-Vegetarin dinner",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(NonVegetarian.this,NonvegDinner.class);
                    startActivity(i);
                }
            });
        }
    }

