package com.example.project_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        final TextView helloTextView = findViewById(R.id.tvTop);

        int h=(new Date()).getHours();
        if (h > 3 && h <  12) helloTextView.setText("Доброе утро");
        if (h > 11 && h <  19) helloTextView.setText(R.string.TextSplash_day);
        if (h > 18 && h <  22) helloTextView.setText("Добрый вечер");
        if (h > 22 || h <  4 ) helloTextView.setText("Доброй ночи");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                finish();
            }
        },5000);
    }
}