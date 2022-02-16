package com.example.project_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final TextView helloTextView = findViewById(R.id.Header);

        TextView tv;
        Animation anim;

        anim = AnimationUtils.loadAnimation(this,R.anim.word_anim);
        tv = (TextView) findViewById(R.id.Header);
        tv.startAnimation(anim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int h=(new Date()).getHours();
                if (h >= 4 && h <=  11) helloTextView.setText(R.string.TextSplash_morning);
                if (h >= 12 && h <=  17) helloTextView.setText(R.string.TextSplash_day);
                if (h >= 18 && h <=  22) helloTextView.setText(R.string.TextSplash_evening);
                if (h >= 23 || h <=  3 ) helloTextView.setText(R.string.TextSplash_night);
            }
        },500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                finish();
            }
        },3000);
    }
}