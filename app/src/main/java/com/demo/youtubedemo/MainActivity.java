package com.demo.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.flipkart.youtubeview.activity.YouTubeActivity;

public class MainActivity extends AppCompatActivity {


    private String API_KEY = "AIzaSyBmUdBkpeF17M7qcZdXG-Juzj8okSu9fes";

    private String VIDEO_ID = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();


    }
}
