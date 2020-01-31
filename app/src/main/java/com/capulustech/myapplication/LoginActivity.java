package com.capulustech.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    EditText usernameET, passwordET;
    Button loginBtn, signUpBtn;
    CheckBox rememberMeCB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
        rememberMeCB = findViewById(R.id.rememberMeCB);
        loginBtn = findViewById(R.id.loginBtn);
        signUpBtn = findViewById(R.id.signUpBtn);

        //SignUp's Button for showing Registration Page
        signUpBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginActivity.this,
                        StudentRegistrationActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*Toast.makeText(LoginActivity.this, "Yet to be Implemented",
                        Toast.LENGTH_LONG).show();*/

                String username = usernameET.getText().toString();
                String password = passwordET.getText().toString();

                if(username.equalsIgnoreCase("android")
                        && password.equalsIgnoreCase("internship"))
                {
                    Toast.makeText(LoginActivity.this, "Login Successful",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Failed",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
