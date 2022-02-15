package com.example.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView username;
    TextView password;
    TextView country;
    TextView gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = (TextView)findViewById(R.id.usernameOutput);
        password = (TextView)findViewById(R.id.passwordOutput);
        country = (TextView)findViewById(R.id.countryOutput);
        gender = (TextView)findViewById(R.id.genderOutput);

        Intent intent = getIntent();
        username.setText(intent.getStringExtra("username"));
        password.setText(intent.getStringExtra("password"));
        country.setText(intent.getStringExtra("country"));
        gender.setText(intent.getStringExtra("gender"));
    }
}