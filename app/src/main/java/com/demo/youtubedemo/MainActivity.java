package com.demo.youtubedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String API_KEY = "AIzaSyBmUdBkpeF17M7qcZdXG-Juzj8okSu9fes";

    private String VIDEO_ID = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Hello Kalpesh Kumawat", Toast.LENGTH_SHORT).show();


    }
}
