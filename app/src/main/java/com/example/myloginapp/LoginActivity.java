package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText username,pass;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        pass = findViewById(R.id.etPassword);
        loginBtn = findViewById(R.id.btnLogin)

        //Button click dia akn do something(listener listen and pbnggil method onclick)
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //compare input adakah sma dngn hardcorder,check sma ke x,klau sma dngn data tu bru bleh login
                //check username and pass
                //usernme =usernm,pas == 1234,bru bleh log in
                //toast messge
                if(username.getText().toString().){

                }
            }
        });

    }
}