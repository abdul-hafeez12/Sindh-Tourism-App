package com.example.sindhtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MakePlan extends AppCompatActivity {

    EditText amount;
    TextView tourDetails;
    int num;
    String textTour = "In this amount you can have these following given tours: ", txtTour = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_plan);

        amount = findViewById(R.id.txtAmount);
        tourDetails = findViewById(R.id.tourText);
    }

    public void findTour(View view){
        num = Integer.valueOf(amount.getText().toString());

        if(num >= 3000 && num <= 5000){
            txtTour = textTour + "\n\n 1.One Day Tour to Larkana  \n 2. One Day Tour to Khairpur ";
        } else if(num > 5000 && num <= 8000) {
            txtTour = textTour + "\n\n 1. One Day Tour to Larkana Top \n 2. One Day Tour to Khairpur \n 3. 2 Days Tour to Sukkur";
        } else if(num > 8000 && num <= 12000) {
            txtTour = textTour + "\n\n 1. 2 Days Tour to thata \n 2. 1 Days Tour to larkana \n 3. 2 Days Tour to thar, hyderabad";
        } else if(num > 12000 && num <= 15000) {
            txtTour = textTour + "\n\n 1. 3 Days Tour to Karachi \n 2. 3 Days Tour to Hyderbad thata \n 3. 4 Days Tour to Karachi";
        } else if(num > 15000 && num <= 20000) {
            txtTour = textTour + "\n\n 1. 5 Days Tour to karachi \n 2. 4 Days Tour to hyaderabad,thata \n 3. 4 Days Tour to Sukkur,Khairpur,Larkana";
        } else {  txtTour = "You have entered wrong amount. Kindly input between 3,000 and 20,000";  }

        tourDetails.setText(txtTour);
    }

}