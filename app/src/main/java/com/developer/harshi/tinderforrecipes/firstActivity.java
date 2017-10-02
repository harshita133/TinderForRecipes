package com.developer.harshi.tinderforrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Harshi on 7/7/2017.
 */

public class firstActivity extends AppCompatActivity {
   // ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
    //if i declare image buton here then app crashes!!!why so?
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_image_openpage);

        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(firstActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
