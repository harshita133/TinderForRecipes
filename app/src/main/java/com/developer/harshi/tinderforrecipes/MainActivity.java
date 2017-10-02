package com.developer.harshi.tinderforrecipes;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.harshi.tinderforrecipes.VegOrNonVeg.NonVegetarian;
import com.developer.harshi.tinderforrecipes.VegOrNonVeg.Vegetarian;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNonveg,btnVeg;
        btnNonveg = (Button) findViewById(R.id.btnNonveg);
        btnVeg = (Button) findViewById(R.id.btnVeg);

        btnNonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You Have Selected Non-Vegetarian",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,NonVegetarian.class);
                startActivity(i);
            }
        });

        btnVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You Have Selected Vegetarian",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Vegetarian.class);
                startActivity(i);
                // speak pls select mel time
//                int res2 = getResources().getIdentifier ( "rec_3s", "raw","com.developer.harshi.tinderforrecipes" );
//                mPlayer = MediaPlayer.create ( MainActivity.this, res2 );
//                mPlayer.start();
            }
        });

    }
}
