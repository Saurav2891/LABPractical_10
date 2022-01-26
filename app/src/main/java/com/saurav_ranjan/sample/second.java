package com.saurav_ranjan.sample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {

    TextView Txt1;
    String msg1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Txt1 = findViewById(R.id.textshow);
        Intent i = getIntent();
        msg1 = i.getStringExtra(com.saurav_ranjan.sample.MainActivity.msg);
        Txt1.setText(msg1);
    }
}
