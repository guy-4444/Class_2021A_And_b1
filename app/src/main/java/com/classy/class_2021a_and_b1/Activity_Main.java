package com.classy.class_2021a_and_b1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity_Main extends AppCompatActivity {
    
    private final String MY_COUNTER = "MY_COUNTER";

    private TextView main_LBL_title;
    private Button main_BTN_counterIncrease;
    private Button main_BTN_calc;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("pttt", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();

        if (savedInstanceState != null) {
            int previousCount = savedInstanceState.getInt(MY_COUNTER);
            count = previousCount;
            main_LBL_title.setText("" + count);
        }
    }

    private void initViews() {
        main_LBL_title.setText("" + count);

        main_BTN_counterIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCounter();
            }
        });

        main_BTN_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalc();
            }
        });
    }

    private void openCalc() {
        Intent myIntent = new Intent(Activity_Main.this, Activity_Calculator.class);
        myIntent.putExtra(Activity_Calculator.EXTRA_KEY_COUNT, count);
        startActivity(myIntent);
    }

    private void findViews() {
        main_LBL_title = findViewById(R.id.main_LBL_title);
        main_BTN_counterIncrease = findViewById(R.id.main_BTN_counterIncrease);
        main_BTN_calc = findViewById(R.id.main_BTN_calc);
    }

    private void increaseCounter() {
        count++;
        main_LBL_title.setText("" + count);
    }


    @Override
    protected void onStart() {
        Log.d("pttt", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("pttt", "onResume");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.d("pttt", "onPause");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("pttt", "onSaveInstanceState");
        super.onSaveInstanceState(outState);

        outState.putInt(MY_COUNTER, count);
    }

    @Override
    protected void onStop() {
        Log.d("pttt", "onStop");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d("pttt", "onDestroy");
        super.onDestroy();
    }

}

/*
BTN
IMG
LBL
EDT
LAY
PRG


 */

