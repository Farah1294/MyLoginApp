package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.os.Handler;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Declare widget ID
    TextView tvUsername;

    public final static String USERNAME = "com.example.myloginapp.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //kNA BRTA TEXT AND IMAGDE DKAT LAYOUT APA NMA ID = IV= IMAGE   TV=  EDIT TEXT
        Intent intent = getIntent();
        String strUsername= intent.getStringExtra("USERNAME");
        tvUsername = (TextView)findViewById(R.id.tvUsername);
        tvUsername.setText(strUsername);



    }
}