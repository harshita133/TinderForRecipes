package com.developer.harshi.tinderforrecipes.BreakfastLunchOrDinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.developer.harshi.tinderforrecipes.CuisineActivity.CuisinesActivityNonvegBreakfast;
import com.developer.harshi.tinderforrecipes.DietActivity.DietActivityNonvegBreakfast;
import com.developer.harshi.tinderforrecipes.R;

/**
 * Created by Harshi on 7/7/2017.
 */

public class NonvegBreakfast extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_concious);

        Button btnSkip = (Button) findViewById(R.id.btnFastfood);
        Button imgHealthy = (Button) findViewById(R.id.btnslowFood);
        //non vegetarian breakfast , would like to eat healthy or u can skip
       // put before button

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(NonvegBreakfast.this, CuisinesActivityNonvegBreakfast.class);
                startActivity(i);
            }
        });

        imgHealthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NonvegBreakfast.this, DietActivityNonvegBreakfast.class);
                startActivity(i);
            }
        });
    }
}
