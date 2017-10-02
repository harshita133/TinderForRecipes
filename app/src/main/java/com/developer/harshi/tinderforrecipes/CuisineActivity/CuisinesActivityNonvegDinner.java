package com.developer.harshi.tinderforrecipes.CuisineActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.harshi.tinderforrecipes.MainSwipeNonvegDinner1;
import com.developer.harshi.tinderforrecipes.R;

import java.util.ArrayList;

/**
 * Created by Harshi on 7/8/2017.
 */

public class CuisinesActivityNonvegDinner extends AppCompatActivity {

    ArrayList<Cuisines> cuisine = generateCuisines();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisines);
        ListView courseListView = (ListView) findViewById(R.id.lv_cuisines);
//        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1,
//                cbCourses
//                );
        CourseAdapter courseAdapter = new CourseAdapter();
        courseListView.setAdapter(courseAdapter);

    }
    static ArrayList<Cuisines> generateCuisines(){
        ArrayList<Cuisines> CuisineNames = new ArrayList<>();
        CuisineNames.add(new Cuisines("North Indian"));
        CuisineNames.add(new Cuisines("South Indian"));
        CuisineNames.add(new Cuisines("Gujrati"));
        CuisineNames.add(new Cuisines("Punjabi"));
        CuisineNames.add(new Cuisines("Rajasthani"));
        CuisineNames.add(new Cuisines("French"));
        CuisineNames.add(new Cuisines("Continental"));
        CuisineNames.add(new Cuisines("Mexican"));
        CuisineNames.add(new Cuisines("Italian"));
        CuisineNames.add(new Cuisines("Afghani"));
        CuisineNames.add(new Cuisines("Tandoori"));
        CuisineNames.add(new Cuisines("Delhites"));
        CuisineNames.add(new Cuisines("Bihari"));

        return CuisineNames;
    }
    class CourseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return cuisine.size();
        }

        @Override
        public Object getItem(int i) {
            return cuisine.get(i);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater li = getLayoutInflater();
            if(view==null)
            {
                view = li.inflate(R.layout.list_item_cuisine,null);
            }
            Cuisines thisCourse =(Cuisines) getItem(i);
//           View itemView= li.inflate(R.layout.list_item_course,null);
            ((TextView)view.findViewById(R.id.tvAddCuisine)).setText(thisCourse.getCuisine());
            if(i==0){
            ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(CuisinesActivityNonvegDinner.this, MainSwipeNonvegDinner1.class);
                    startActivity(i);
                }
            });}
            if(i==1){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==2){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==3){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==4){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==5){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==6){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==7){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==8){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==9){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==10){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==11){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }
            if(i==12){
                ((TextView)view.findViewById(R.id.tvAddCuisine)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(CuisinesActivityNonvegDinner.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }

            return view;
        }
    }
}