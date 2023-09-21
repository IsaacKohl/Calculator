package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addClick(View view) {
        EditText t1 = (EditText) findViewById(R.id.editTextText);
        EditText t2 = (EditText) findViewById(R.id.editTextText2);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int result = num1 + num2;
        goToActivity(result);

    }

    public void subtractClick(View view) {
        EditText t1 = (EditText) findViewById(R.id.editTextText);
        EditText t2 = (EditText) findViewById(R.id.editTextText2);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int result = num1 - num2;
        goToActivity(result);

    }

    public void divideClick(View view) {
        EditText t1 = (EditText) findViewById(R.id.editTextText);
        EditText t2 = (EditText) findViewById(R.id.editTextText2);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

        if (num2 ==0) {
            Toast.makeText(MainActivity.this, "Cannot divide by 0", Toast.LENGTH_LONG).show();
        }
        int result = num1 / num2;
        goToActivity(result);

    }

    public void multiplyClick(View view) {
        EditText t1 = (EditText) findViewById(R.id.editTextText);
        EditText t2 = (EditText) findViewById(R.id.editTextText2);
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int result = num1 * num2;
        goToActivity(result);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity(int i) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", i);
        startActivity(intent);
    }
}