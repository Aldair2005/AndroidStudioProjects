package com.example.blanco;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class calculadora extends AppCompatActivity {

    private EditText editTextNumber;
    private double operand1, operand2;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        editTextNumber = findViewById(R.id.editTextNumber);
        operand1 = 0;
        operand2 = 0;
        operator = "";

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("1");
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("2");
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("3");
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("4");
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("5");
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("6");
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("7");
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("8");
            }
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("9");
            }
        });

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("0");
            }
        });

        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(editTextNumber.getText().toString());
                operator = "+";
                editTextNumber.setText("");
            }
        });

        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(editTextNumber.getText().toString());
                operator = "-";
                editTextNumber.setText("");
            }
        });

        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(editTextNumber.getText().toString());
                operator = "*";
                editTextNumber.setText("");
            }
        });

        Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1 = Double.parseDouble(editTextNumber.getText().toString());
                operator = "/";
                editTextNumber.setText("");
            }
        });

        Button buttonEquals = findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand2 = Double.parseDouble(editTextNumber.getText().toString());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                }

                operand2 = Double.parseDouble(editTextNumber.getText().toString());

                switch (operator) {
                    case "-":
                        result = operand1 - operand2;
                        break;
                }
                operand2 = Double.parseDouble(editTextNumber.getText().toString());

                switch (operator) {
                    case "*":
                        result = operand1 * operand2;
                        break;
            }
                operand2 = Double.parseDouble(editTextNumber.getText().toString());

                switch (operator) {
                    case "/":
                        result = operand1 / operand2;
                        break;
                }
                editTextNumber.setText(String.valueOf(result));
            }
        });
    }
}
