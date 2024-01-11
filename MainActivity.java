package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView ans;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        ans = (TextView) findViewById(R.id.ans);
        b1 = (Button) findViewById(R.id.plus);
        b2 = (Button) findViewById(R.id.minus);
        b3 = (Button) findViewById(R.id.multi);
        b4 = (Button) findViewById(R.id.div);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                Double res = a + b;
                ans.setText(a + " + " + b + " = " + res);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                Double res = a - b;
                ans.setText(a + " + " + b + " = " + res);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                Double res = a * b;
                ans.setText(a + " + " + b + " = " + res);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(e1.getText().toString());
                Double b = Double.parseDouble(e2.getText().toString());
                Double res = a / b;
                ans.setText(a + " + " + b + " = " + res);
            }
        });
    }
}