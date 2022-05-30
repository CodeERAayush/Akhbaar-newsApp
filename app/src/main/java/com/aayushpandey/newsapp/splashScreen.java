package com.aayushpandey.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ProgressBar progressBar;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar=findViewById(R.id.progressBar);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    try {
                        progressBar.setVisibility(View.GONE);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    finally {
                        Intent intent =new Intent(splashScreen.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }


                }
            }
        };thread.start();
    }
}