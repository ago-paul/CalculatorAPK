package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void onButtonClick(View v)
    {
        EditText e1= (EditText)findViewById(R.id.editText3);
        EditText e2= (EditText)findViewById(R.id.editText4);
        TextView t1= (TextView)findViewById(R.id.textView3);
        TextView t2= (TextView)findViewById(R.id.textView4);

int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
    int sum=n1+n2;
    t1.setText(Integer.toString(sum));
    }}
