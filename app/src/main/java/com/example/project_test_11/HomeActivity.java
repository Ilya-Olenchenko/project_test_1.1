package com.example.project_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void burger_click(View view) {
        RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(700);

        final ImageView burger = findViewById(R.id.imageView_burger_icon);
        burger.startAnimation(anim);
        //burger.setAnimation(null);
    }

    public void home_click(View view) {

    }

    public void statistic_click(View view) {

    }

    public void dream_click(View view) {

    }

    public void music_click(View view) {

    }
}