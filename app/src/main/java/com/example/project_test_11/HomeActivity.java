package com.example.project_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    public void setColor(int obj, int color){
        final ImageView imageView = findViewById(obj);
        imageView.setColorFilter(imageView.getContext().getResources().getColor(color), PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setColor(R.id.imageView_home_icon, R.color.white);
    }


    public void burger_click(View view) {

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