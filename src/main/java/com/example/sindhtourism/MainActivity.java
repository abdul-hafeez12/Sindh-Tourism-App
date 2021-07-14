package com.example.sindhtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.percentile);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnim();
    }

    public void progressAnim(){
        ProgressBarAnime progressBarAnime = new ProgressBarAnime(this, progressBar, textView, 0f, 100f);
        progressBarAnime.setDuration(5000);
        progressBar.setAnimation(progressBarAnime);
    }
}