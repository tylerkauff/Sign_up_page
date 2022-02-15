package com.example.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Populate the spinner
        Spinner spinner = (Spinner) findViewById(R.id.countrySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.countries_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void submitSignup(View view) {
        Log.i("info", "Button clicked!");

        EditText username = (EditText) findViewById(R.id.editTextUsername);
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        RadioGroup gender = (RadioGroup) findViewById(R.id.genderRadioGroup);
        Spinner country = (Spinner) findViewById(R.id.countrySpinner);

        int selectedId = gender.getCheckedRadioButtonId();
        RadioButton selectedGender = (RadioButton) findViewById(selectedId);

        Intent intent = new Intent(getBaseContext(), MainActivity2.class);
        intent.putExtra("username", username.getText().toString());
        intent.putExtra("password", password.getText().toString());
        intent.putExtra("gender", selectedGender.getText().toString());
        intent.putExtra("country", country.getSelectedItem().toString());

        startActivity(intent);

    }
}