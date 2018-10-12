package com.calc.imi.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button  buttonAdd, buttonSub, buttonDivision, buttonMul, buttonEqual;

    EditText MyCalaculatorEditText;

    float mValueOne, mValueTwo;

    boolean MyCalaculatorAddition, mSubtract, MyCalaculatorMultiplication, MyCalaculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        MyCalaculatorEditText = (EditText) findViewById(R.id.edt1);
        buttonEqual = (Button) findViewById(R.id.buttoneql);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (MyCalaculatorEditText == null) {
                    MyCalaculatorEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(MyCalaculatorEditText.getText() + "");
                    MyCalaculatorAddition = true;
                    MyCalaculatorEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(MyCalaculatorEditText.getText() + "");
                mSubtract = true;
                MyCalaculatorEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(MyCalaculatorEditText.getText() + "");
                MyCalaculatorMultiplication = true;
                MyCalaculatorEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(MyCalaculatorEditText.getText() + "");
                MyCalaculatorDivision = true;
                MyCalaculatorEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(MyCalaculatorEditText.getText() + "");

                if (MyCalaculatorAddition == true) {
                    MyCalaculatorEditText.setText(mValueOne + mValueTwo + "");
                    MyCalaculatorAddition = false;
                }

                if (mSubtract == true) {
                    MyCalaculatorEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (MyCalaculatorMultiplication == true) {
                    MyCalaculatorEditText.setText(mValueOne * mValueTwo + "");
                    MyCalaculatorMultiplication = false;
                }

                if (MyCalaculatorDivision == true) {
                    MyCalaculatorEditText.setText(mValueOne / mValueTwo + "");
                }
            }
        });
    }
}