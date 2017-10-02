package com.developer.harshi.tinderforrecipes.DietActivity;

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

import com.developer.harshi.tinderforrecipes.MainSwipeActivityNonvegBreakfastdiet1;
import com.developer.harshi.tinderforrecipes.R;

import java.util.ArrayList;

/**
 * Created by Harshi on 7/8/2017.
 */

public class DietActivityNonvegBreakfast extends AppCompatActivity {

    ArrayList<DietVariants> Diets = generateCuisines();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        ListView courseListView = (ListView) findViewById(R.id.lv_diet);
//        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1,
//                cbCourses
//                );
        CourseAdapter courseAdapter = new CourseAdapter();
        courseListView.setAdapter(courseAdapter);

    }
    static ArrayList<DietVariants> generateCuisines(){
        ArrayList<DietVariants> DietVariants = new ArrayList<>();
        DietVariants.add(new DietVariants("Low Calories"));
        DietVariants.add(new DietVariants("Low Sugar"));
        DietVariants.add(new DietVariants("Low Protein"));
        DietVariants.add(new DietVariants("Low Sodium"));
        return DietVariants;
    }
    class CourseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Diets.size();
        }

        @Override
        public Object getItem(int i) {
            return Diets.get(i);
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
                view = li.inflate(R.layout.list_item_diet,null);
            }
            DietVariants thisCourse =(DietVariants) getItem(i);
//           View itemView= li.inflate(R.layout.list_item_course,null);
            ((TextView)view.findViewById(R.id.tvAddDietVariant)).setText(thisCourse.getDietFeatures());
            if(i==0){
                ((TextView)view.findViewById(R.id.tvAddDietVariant)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DietActivityNonvegBreakfast.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==1){
                ((TextView)view.findViewById(R.id.tvAddDietVariant)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(DietActivityNonvegBreakfast.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(DietActivityNonvegBreakfast.this, MainSwipeActivityNonvegBreakfastdiet1.class);
                        startActivity(i);
                    }});
            }
            if(i==2){
                ((TextView)view.findViewById(R.id.tvAddDietVariant)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DietActivityNonvegBreakfast.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }
                });}
            if(i==3){
                ((TextView)view.findViewById(R.id.tvAddDietVariant)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DietActivityNonvegBreakfast.this,"Data to be Added",Toast.LENGTH_SHORT).show();
                    }});
            }

            return view;
        }
    }
}