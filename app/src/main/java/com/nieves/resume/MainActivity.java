package com.nieves.resume;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CheckBox educCheckBox = findViewById(R.id.educCheckBox);
        RadioGroup educationalView = findViewById(R.id.educationalView);

        educCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the RadioGroup if the CheckBox is checked
                educationalView.setVisibility(View.VISIBLE);
            } else {
                // Hide the RadioGroup if the CheckBox is unchecked
                educationalView.setVisibility(View.GONE);
            }
        });

        CheckBox skillCheckBox = findViewById(R.id.skillCheckBox);
        RadioGroup skillView  = findViewById(R.id.skillView);

        skillCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the RadioGroup if the CheckBox is checked
                skillView.setVisibility(View.VISIBLE);
            } else {
                // Hide the RadioGroup if the CheckBox is unchecked
                skillView.setVisibility(View.GONE);
            }
        });

        CheckBox workCheckBox = findViewById(R.id.workCheckBox);
        RadioGroup workView  = findViewById(R.id.workView);

        workCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the RadioGroup if the CheckBox is checked
                workView.setVisibility(View.VISIBLE);
            } else {
                // Hide the RadioGroup if the CheckBox is unchecked
                workView.setVisibility(View.GONE);
            }
        });

        SeekBar seekBar1 = findViewById(R.id.seekBar1);
        seekBar1.setEnabled(false);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        seekBar2.setEnabled(false);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        seekBar3.setEnabled(false);
        SeekBar seekBar4 = findViewById(R.id.seekBar4);
        seekBar4.setEnabled(false);
}}