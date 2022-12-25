package com.example.myloginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername,etPass;
    Button btnLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPass = findViewById(R.id.etPass);
        btnLogIn = findViewById(R.id.btnLogIn);

        //Button click dia akn do something(listener listen and pbnggil method onclick)
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //compare input adakah sma dngn hardcorder,check sma ke x,klau sma dngn data tu bru bleh login
                //check username and pass
                //usernme =usernm,pas == 1234,bru bleh log in
                //toast messge//22 mesti true klau x dia pegi else
                if(etUsername.getText().toString().equals("user")&& etPass.getText().toString().equals("1234")){
                    // Letak intent untuk navigate ke mainpage
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    //Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                } else {
                    //Panggil method Alert Dialog
                    showAlertDialogButtonClicked();
                    //Toast.makeText(LoginActivity.this, "Login Fail,Please Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void showAlertDialogButtonClicked() {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("Username and Password is Wrong,Please try Again!!");
        // add a button
        builder.setPositiveButton("OK", null);
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}