package com.example.sindhtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TouristsPoints extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourists_points);

        intent = new Intent(this, PointsDetails.class);
    }

    public void larkana(View view){
        intent.putExtra("point", "larkana");
        startActivity(intent);
    }

    public void hyderabad(View view){
        intent.putExtra("point", "hyderabad");
        startActivity(intent);
    }

    public void tharparker(View view){
        intent.putExtra("point", "tharparker");
        startActivity(intent);
    }

    public void matiari(View view){
        intent.putExtra("point", "matiari");
        startActivity(intent);
    }

    public void karachi(View view){
        intent.putExtra("point", "karachi");
        startActivity(intent);
    }

    public void sukkur(View view){
        intent.putExtra("point", "sukkur");
        startActivity(intent);
    }

    public void thatta(View view){
        intent.putExtra("point", "thatta");
        startActivity(intent);
    }

    public void dadu(View view){
        intent.putExtra("point", "dadu");
        startActivity(intent);
    }
}