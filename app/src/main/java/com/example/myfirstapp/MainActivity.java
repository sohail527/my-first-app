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
    Button b1 , b2 , b4 , b5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*result = (TextView)findViewById(R.id.result);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);*/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  num1=Integer.ParseInt()


            }
        });
    }


}
