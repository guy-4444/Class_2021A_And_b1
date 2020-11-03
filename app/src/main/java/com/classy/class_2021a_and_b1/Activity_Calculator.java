package com.classy.class_2021a_and_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Calculator extends AppCompatActivity {

    public static final String EXTRA_KEY_COUNT = "EXTRA_KEY_COUNT";

    private TextView calculator_LBL_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        findViews();

        int previousCount = getIntent().getIntExtra(EXTRA_KEY_COUNT, -1);
        calculator_LBL_result.setText("" + previousCount);
    }

    private void findViews() {
        calculator_LBL_result = findViewById(R.id.calculator_LBL_result);
    }
}