package com.example.sindhtourism;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarAnime extends Animation {
    Context context;
    ProgressBar progressBar;
    TextView textView;
    float from, to;

    public ProgressBarAnime(Context context, ProgressBar progressBar, TextView textView, float from, float to){
        this.context = context;
        this.progressBar = progressBar;
        this.textView = textView;
        this.from = from;
        this.to = to;
    }

    protected void applyTransformation(float time, Transformation transformation){
        super.applyTransformation(time, transformation);
        float value = from + (to - from) * time;
        progressBar.setProgress((int)value);
        textView.setText((int)value+" %");

        if(value == to){context.startActivity(new Intent(context, HomeScreen.class));}
    }
}