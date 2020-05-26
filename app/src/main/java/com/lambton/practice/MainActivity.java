package com.lambton.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button plus;
    private Button minus;
    private Button multi;
    private Button equls;
    private Button clear;
    private EditText textview;
    private EditText textview2;
    private TextView view;
    private String hold = "";
    private String what = "";
    private int hold_int = 0;
    private int hold_int2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.btn_1);
        two = (Button) findViewById(R.id.btn_2);
        three = (Button) findViewById(R.id.btn_3);
        four = (Button) findViewById(R.id.btn_4);
        plus = (Button) findViewById(R.id.btn_plus);
        minus = (Button) findViewById(R.id.btn_minus);
        multi = (Button) findViewById(R.id.btn_mlti);
        equls = (Button)  findViewById(R.id.btn_equal);
        clear = (Button)  findViewById(R.id.clear);
        textview = (EditText) findViewById(R.id.editText);
        textview2 = (EditText) findViewById(R.id.editText3);
        view = (TextView) findViewById(R.id.textView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold = textview.getText().toString();
                hold = hold+ "1";
                textview.setText(hold);
                hold = "";
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold = (textview.getText().toString());
                hold = hold+ "2";
                textview.setText(hold);
                hold = "";
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold = (textview.getText().toString());
                hold = hold+ "3";
                textview.setText(hold);
                hold = "";
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold = (textview.getText().toString());
                hold = hold+ "4";
                textview.setText(hold);
                hold = "";
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview.setText("");
                textview2.setText("0");

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold_int = Integer.parseInt(textview.getText().toString());

                view.setText("Add");
                textview.setText("0");

                what ="Add";
                hold_int2 = Integer.parseInt(textview2.getText().toString());

                textview2.setText(String.valueOf(hold_int + hold_int2));
            }
        });



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold_int = Integer.parseInt(textview.getText().toString());

                view.setText("Minus");
                textview.setText("0");

                what ="Add";
                hold_int2 = Integer.parseInt(textview2.getText().toString());

                textview2.setText(String.valueOf(hold_int - hold_int2));
            }
        });

        equls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold_int = Integer.parseInt(textview.getText().toString());
                hold_int2 = Integer.parseInt(textview2.getText().toString());

                if (what.equals("Add"))
                {

                    textview2.setText(String.valueOf(hold_int + hold_int2));
                }
                else if(what.equals("Minus"))
                {

                    textview2.setText(String.valueOf(hold_int - hold_int2));
                }

                hold_int = 0;hold_int2= 0;
            }
        });

    }
}
