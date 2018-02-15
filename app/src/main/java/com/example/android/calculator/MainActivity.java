package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int firstNumber;
    int secondNumber;
    int i=0;

    @Override
    public void onClick(View view) {

        TextView numberPressed = (TextView) view;
        TextView display = (TextView) findViewById(R.id.display);
        TextView topDisplay = (TextView) findViewById(R.id.top_display);

        if(view.getId() != R.id.add && view.getId() != R.id.subtract && view.getId() != R.id.equal && view.getId() != R.id.multiply && view.getId() != R.id.divide && view.getId() != R.id.clear){
            display.setText(display.getText().toString() + numberPressed.getText().toString());
        }
        else {
            switch (view.getId()) {

                case R.id.clear: {
                    display.setText("");
                    break;
                }
                case R.id.add: {
                    if(display.getText().toString().equals("")){
                        break;
                    }
                    Toast.makeText(MainActivity.this, "Give second number", Toast.LENGTH_SHORT).show();
                    firstNumber = Integer.parseInt(display.getText().toString());
                    topDisplay.setText(String.valueOf(firstNumber));
                    display.setText("");

                    i = 1;
                    break;
                }
                case R.id.subtract: {
                    if(display.getText().toString().equals("")){
                        break;
                    }
                    Toast.makeText(MainActivity.this, "Give second number", Toast.LENGTH_SHORT).show();
                    firstNumber = Integer.parseInt(display.getText().toString());
                    topDisplay.setText(String.valueOf(firstNumber));
                    display.setText("");
                    i = 2;
                    break;
                }
                case R.id.multiply: {
                    if(display.getText().toString().equals("")){
                        break;
                    }
                    Toast.makeText(MainActivity.this, "Give second number", Toast.LENGTH_SHORT).show();
                    firstNumber = Integer.parseInt(display.getText().toString());
                    topDisplay.setText(String.valueOf(firstNumber));
                    display.setText("");
                    i = 3;
                    break;
                }
                case R.id.divide: {
                    if(display.getText().toString().equals("")){
                        break;
                    }
                    Toast.makeText(MainActivity.this, "Give second number", Toast.LENGTH_SHORT).show();
                    firstNumber = Integer.parseInt(display.getText().toString());
                    topDisplay.setText(String.valueOf(firstNumber));
                    display.setText("");
                    i=4;
                    break;
                }

                case R.id.equal: {
                    secondNumber = Integer.parseInt(display.getText().toString());
                    if (i == 1) {
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        topDisplay.setText("");
                    } else if (i == 2) {
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        topDisplay.setText("");
                    } else if (i == 3) {
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        topDisplay.setText("");
                    }
                    else if(i == 4) {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                        topDisplay.setText("");
                    }
                    break;
                }

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView seven = (TextView) findViewById(R.id.seven);
        TextView eight = (TextView) findViewById(R.id.eight);
        TextView nine = (TextView) findViewById(R.id.nine);
        TextView four = (TextView) findViewById(R.id.four);
        TextView five = (TextView) findViewById(R.id.five);
        TextView six = (TextView) findViewById(R.id.six);
        TextView one = (TextView) findViewById(R.id.one);
        TextView two = (TextView) findViewById(R.id.two);
        TextView three = (TextView) findViewById(R.id.three);
        TextView decimal = (TextView) findViewById(R.id.decimal);
        TextView zero = (TextView) findViewById(R.id.zero);
        TextView equal = (TextView) findViewById(R.id.equal);
        TextView clear = (TextView) findViewById(R.id.clear);
        TextView subtract = (TextView) findViewById(R.id.subtract);
        TextView add = (TextView) findViewById(R.id.add);
        TextView multiply = (TextView) findViewById(R.id.multiply);
        TextView divide = (TextView) findViewById(R.id.divide);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        decimal.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
        subtract.setOnClickListener(this);
        add.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

}

}
