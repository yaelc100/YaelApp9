package com.example.cohen.yaelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    EditText Num;
    int action = 0;
    double result;
    double first, second;
    double lastresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num = (EditText) findViewById(R.id.Num);
    }

    public void plus(View view) {

        if (action == 0) {
            action = 1;
            String st = Num.getText().toString();
            if (!st.isEmpty()) {
                first=Double.parseDouble(st);}
            Num.setText(" ");

            } else {
                Toast.makeText(getApplicationContext(), "Please get your awnser firs", Toast.LENGTH_SHORT).show();
            }
        }

    public void minus(View view) {
        if (action == 0) {
            action = 2;
            String st = Num.getText().toString();
            if (!st.isEmpty()) {
                first=Double.parseDouble(st);}
                Num.setText(" ");
            } else {
                Toast.makeText(getApplicationContext(), "Please get your awnser firs", Toast.LENGTH_SHORT).show();
            }
        }


    public void kaful(View view) {
        if (action == 0) {
            action = 3;
            String st = Num.getText().toString();
            if (!st.isEmpty()) {
                first=Double.parseDouble(st);}
                Num.setText(" ");
            } else {
                Toast.makeText(getApplicationContext(), "Please get your awnser firs", Toast.LENGTH_SHORT).show();
            }

        }


    public void hiluk(View view) {
        if (action == 0) {
            action = 4;
            String st = Num.getText().toString();
            if (!st.isEmpty()) {
                first=Double.parseDouble(st);
                Num.setText(" ");
            } else {
                Toast.makeText(getApplicationContext(), "Please get your awnser first", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void answer(View view) {
        if(!Num.getText().toString().equals(" ")&&!Num.getText().toString().isEmpty()) {
            String st=Num.getText().toString();
            if (second==0) {
                second = Double.parseDouble(st);
            }
            Toast.makeText(getApplicationContext(), ""+action, Toast.LENGTH_LONG).show();
            switch (action) {

                case 1:
                    result=first+second;
                    break;
                case 2:
                    result=first-second;
                    break;
                case 3:
                    result=first*second;
                    break;
                case 4:
                    result=first/second;
                    break;
            }
            Num.setText(""+ result);
            action=0;
            second=0;
            lastresult=result;


        }
        else {
            Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_LONG).show();

        }
    }

    public void restart(View view) {
        first=0;
        Num.setText(" ");
        second=0;
        action=0;
        result=0;
    }

    public void next(View view) {
        Intent t=new Intent(Main.this, Credit.class);
        t.putExtra("result", lastresult);
        startActivity(t);
    }
}
