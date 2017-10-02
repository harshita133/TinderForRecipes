package com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.developer.harshi.tinderforrecipes.CuisineActivity.CuisinesActivityVegDinner;
import com.developer.harshi.tinderforrecipes.DietActivity.DietActivityVegDinner;
import com.developer.harshi.tinderforrecipes.R;

/**
 * Created by Harshi on 7/7/2017.
 */

public class VegDinner extends AppCompatActivity {

    Button btnHeart,btnDiabeties,btnCalories,btnNone;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_concious);

        Button btnSkip = (Button) findViewById(R.id.btnFastfood);
        Button imgHealthy = (Button) findViewById(R.id.btnslowFood);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VegDinner.this, CuisinesActivityVegDinner.class);
                startActivity(i);
            }
        });

        imgHealthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VegDinner.this, DietActivityVegDinner.class);
                startActivity(i);
            }
        });
    }
}
