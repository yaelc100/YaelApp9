package com.example.cohen.yaelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credit extends AppCompatActivity {
TextView resultText;
double result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        resultText=(TextView) findViewById(R.id.resultText);
        Intent gi=getIntent();
        result1=gi.getDoubleExtra("result", 0);
        resultText.setText(""+result1);
    }

    public void back(View view) {
        Intent t=new Intent(Credit.this,Main.class);
        startActivity(t);
    }
}
