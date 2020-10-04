package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1 , num2;
    Button b1 ,b2 , b4 , b5 ;

    double n1,n2;
    double r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                r=n1+n2;
                result.setText(String.valueOf(r));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                r=n1-n2;
                result.setText(String.valueOf(r));

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                r=n1*n2;
                result.setText(String.valueOf(r));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(num1.getText().toString());
                n2=Double.parseDouble(num2.getText().toString());
                r=n1/n2;
                result.setText(String.valueOf(r));

            }
        });


    }


}
