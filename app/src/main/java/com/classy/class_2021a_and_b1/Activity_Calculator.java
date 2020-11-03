package com.classy.class_2021a_and_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Calculator extends AppCompatActivity {

    public static final String EXTRA_KEY_COUNT = "EXTRA_KEY_COUNT";

    private TextView calculator_LBL_result;
    private Button calculator_BTN_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        findViews();

        int previousCount = getIntent().getIntExtra(EXTRA_KEY_COUNT, -1);
        calculator_LBL_result.setText("" + previousCount);



        calculator_BTN_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void findViews() {
        calculator_LBL_result = findViewById(R.id.calculator_LBL_result);
        calculator_BTN_close = findViewById(R.id.calculator_BTN_close);
    }
}