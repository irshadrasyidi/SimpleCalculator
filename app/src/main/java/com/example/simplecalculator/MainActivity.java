package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnPlus, btnMinus, btnTimes, btnDivide,
            btnComa, btnEqual,
            btnClear;

    EditText inputNumber;

    double val1, val2;

    boolean add, substract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnTimes = (Button) findViewById(R.id.btnTimes);
        btnDivide = (Button) findViewById(R.id.btnDivide);

        btnComa = (Button) findViewById(R.id.btnComa);
        btnEqual = (Button) findViewById(R.id.btnEqual);

        btnClear = (Button) findViewById(R.id.btnClear);

        inputNumber = (EditText) findViewById(R.id.inputNumber);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + "9");
            }
        });

        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText(inputNumber.getText() + ".");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumber.setText("");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputNumber == null){
                    inputNumber.setText("");
                }else{
                    val1 = Float.parseFloat(inputNumber.getText() + "");
                    add = true;
                    inputNumber.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(inputNumber.getText() + "");
                substract = true;
                inputNumber.setText(null);
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(inputNumber.getText() + "");
                multiply = true;
                inputNumber.setText(null);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(inputNumber.getText() + "");
                divide = true;
                inputNumber.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(inputNumber.getText() + "");

                if(add == true){
                    inputNumber.setText(val1 + val2 + "");
                    add = false;
                }

                if(substract == true){
                    inputNumber.setText(val1 - val2 + "");
                    substract = false;
                }

                if(multiply == true){
                    inputNumber.setText(val1 * val2 + "");
                    multiply = false;
                }

                if(divide == true){
                    inputNumber.setText(val1 / val2 + "");
                    divide = false;
                }
            }
        });


    }
}
