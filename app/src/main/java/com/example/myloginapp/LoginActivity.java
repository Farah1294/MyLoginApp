package com.example.myloginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //Declare widget ID
    EditText etUsername,etPass;
    Button btnLogIn;

    public final static String USERNAME = "com.example.myloginapp.USERNAME";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //Set Variable for Widget
        etUsername = findViewById(R.id.etUsername);
        etPass = findViewById(R.id.etPass);
        btnLogIn = findViewById(R.id.btnLogIn);





        //Button click dia akn do something(listener listen and pbnggil method onclick)
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                //Declare ID for widget
//                etUsername = findViewById(R.id.etUsername);
//                etPass = findViewById(R.id.etPass);
//                btnLogIn = findViewById(R.id.btnLogIn);


                //get data from Edit Text
                String username = etUsername.getText().toString();//msg hold username and convert to string
                String pass = etPass.getText().toString();



                //compare input adakah sma dngn hardcorder,check sma ke x,klau sma dngn data tu bru bleh login
                //check username and pass
                //usernme =usernm,pas == 1234,bru bleh log in
                //toast messge//22 mesti true klau x dia pegi else
//                if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches())
                if(username.equals("user")&& pass.equals("1234")){

                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);

                    //Send data
                    intent.putExtra("USERNAME",username);

                    startActivity(intent);
                    //Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                } else {
                    //Show Alert Dialog
                    showAlertDialogButton();
                    //Toast.makeText(LoginActivity.this, "Login Fail,Please Try Again", Toast.LENGTH_SHORT).show();
                }
                if(username.isEmpty() && pass.isEmpty()){
                    showAlertDialogButton2();
                }
                if(username.isEmpty() || pass.isEmpty()){
                    showAlertDialogButton3();
                }

            }
        });

    }

    public void showAlertDialogButton() {
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

    public void showAlertDialogButton2() {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Log In Failed");
        builder.setMessage("Username or Password is empty. Please fill in the blank!");
        // add a button
        builder.setPositiveButton("OK", null);
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showAlertDialogButton3() {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Log In Failed");
        builder.setMessage("Username and Password are empty. Please fill in the blanks!");
        // add a button
        builder.setPositiveButton("OK", null);
        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}