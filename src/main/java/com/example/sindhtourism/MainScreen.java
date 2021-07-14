package com.example.sindhtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void upcomings(View view){
        Intent intent = new Intent(this, UpcomingTrips.class);
        startActivity(intent);
    }

    public void touristsPoints(View view){
        Intent intent = new Intent(this, TouristsPoints.class);
        startActivity(intent);
    }

    public void makePlan(View view){
        Intent intent = new Intent(this, MakePlan.class);
        startActivity(intent);
    }

    public void gallery(View view){
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }
}