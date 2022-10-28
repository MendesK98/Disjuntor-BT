package com.example.disjuntorbt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Disjuntores extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disjuntores);

        TextView tvGuts = (TextView) findViewById(R.id.tvGuts);

        Intent i = getIntent();
        String x = i.getStringExtra("mensagem");


        tvGuts.setText(x);
    }
}