package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDatePicker, btnTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDatePicker = findViewById(R.id.btnDatePicker);
        btnDatePicker.setOnClickListener(v -> {
            DialogFragment fragment = new DatePickerFragment();
            fragment.show(getSupportFragmentManager(), "Pick a date");
        });
        btnTimePicker = findViewById(R.id.btnTimePicker);
        btnTimePicker.setOnClickListener(v -> {
            DialogFragment fragment = new TimePickerFragment();
            fragment.show(getSupportFragmentManager(), "Pick time");
        });
    }
}