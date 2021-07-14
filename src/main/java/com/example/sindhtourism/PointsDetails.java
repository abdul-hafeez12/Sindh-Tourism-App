package com.example.sindhtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PointsDetails extends AppCompatActivity {
    ImageView pointImage;
    TextView pointDetail;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_details);

        pointImage = findViewById(R.id.imgPoint);
        pointDetail = findViewById(R.id.txtDetail);

        name = getIntent().getStringExtra("point");
        setDetails();
    }

    public void setDetails(){

        if(name.equals("larkana")){
            pointImage.setImageResource(R.drawable.larkana);
            pointDetail.setText("Larkana is the 17th largest city in Pakistan. It is located at 40 miles to the south of district Shikarpur and 36 miles to the northeast of district Dadu. The historical name of Larkana was Chandka.");
        } else if(name.equals("hyderabad")){
            pointImage.setImageResource(R.drawable.hyderabad);
            pointDetail.setText("Hyderabad is the second largest city of Sindh Province. The city was conquered by Mian Ghulam Shah Kalhoro upon the ruins of a Mauryan fishing village along the coast of the Indus River. Formerly, Hyderabad was known as Neroon Kot. Hyderabad city is rich in culture, traditions and history due to the fact that it lies alongside the River Indus. This city used to be renowned as the “Paris of India” due to the belief that the streets of the city were washed each morning with clean drinking water from the River Indus.");
        } else if(name.equals("karachi")){
            pointImage.setImageResource(R.drawable.karachi);
            pointDetail.setText("Karachi is the capital and the metropolis city of Sindh. It is the stock and trade of Pakistan. It is located on the eastern coastline of the Arabian Sea. It is one of the revenue generating hubs of the nation. It is also bestowed with the largest seaport in the county. Karachi populace is remarked as different strokes due to their liveliness and busy life round the clock.");
        } else if(name.equals("thatta")){
            pointImage.setImageResource(R.drawable.thatta);
            pointDetail.setText("Thatta city ostensibly reveals mystic lineages of the unique culture and tradition of Sindh. It is presumed as the Rome of Pakistan. Thatta is outlandish town, utterly 98 KM to the east of Karachi. It represents one of the fascinating architecture and historical monuments like Makli Hills, the largest necropolis in the world, which spreads over an area of 10 square km.");
        } else if(name.equals("dadu")){
            pointImage.setImageResource(R.drawable.dadu);
            pointDetail.setText("Dadu is a remarkable district of Sindh. The eminent tourist attractions in Dadu include Gorakh Hill Station, appraised as the “Murree of Sindh”, Jamia Masjid Khudabad and Khirthar Maountains.");
        } else if(name.equals("matiari")){
            pointImage.setImageResource(R.drawable.matiari);
            pointDetail.setText("Historically, Matiari district holds the honour to be ruled over by one of the prominent dynasties such as the Soomras, the Summas, the Arghuns , the Kalhoras and the Talpurs at Sindh. At the time of independence of Pakistan, in 1947, district Matiari was a taluka of district Hyderabad until in 2005, when it was given the status of a district.");
        } else if(name.equals("tharparker")){
            pointImage.setImageResource(R.drawable.tharparker);
            pointDetail.setText("The Tharparkar district occurs in the south east of Sindh. It is believed to be one of the 29 districts of the Sindh Province of Pakistan. More than 90% of the people live in more than 200 villages. The Headquarters of the Thar is known as Mithi. A very large area of Tharparkar constitutes of the Thar Desert.");
        } else if(name.equals("sukkur")){
            pointImage.setImageResource(R.drawable.sukkur);
            pointDetail.setText("Sukkur is the third largest city in Sindh province; Located at the bank of River Indus. Formerly Sukkur was named as Aror or Bakhar, but later given the name Sukkur which means superiority in Sindhi. The cultural spots and bazaars in Sukkur show how rich it is in Sindhi culture, and they are the most prominent attractions of the city." +
                    "It is beautiful and of interest to tourists.");
        }
    }

}