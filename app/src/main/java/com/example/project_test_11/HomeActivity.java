package com.example.project_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



    public void burger_click(View view) {


        //burger.setAnimation(null);
    }

    public void home_click(View view) {
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.white);
        final ImageView home = findViewById(R.id.imageView_home_icon);
        home.setColorFilter(textColor);

    }

    public void statistic_click(View view) {
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.white);
        final ImageView statistic = findViewById(R.id.imageView_statistic_icon);
        statistic.setColorFilter(textColor);
    }

    public void dream_click(View view) {
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.white);
        final ImageView dream = findViewById(R.id.imageView_dream_icon);
        dream.setColorFilter(textColor);
    }

    public void music_click(View view) {
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.white);
        final ImageView music = findViewById(R.id.imageView_music_icon);
        music.setColorFilter(textColor);
    }
}