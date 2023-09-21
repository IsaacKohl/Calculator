package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textView = (TextView) findViewById(R.id.textView2);
        Intent intent =getIntent();
        //String i = intent.getStringExtra("result");
        int p = intent.getIntExtra("result", 0);

        textView.setText("Your answer is "+p);
    }
}