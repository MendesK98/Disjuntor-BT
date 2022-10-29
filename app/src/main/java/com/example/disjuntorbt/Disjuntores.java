package com.example.disjuntorbt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Disjuntores extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disjuntores);

        TextView tvGuts =  findViewById(R.id.tvGuts);
        Button dados =  findViewById(R.id.btDados);

       Intent a = new Intent(this, Dados.class);

        Intent i = getIntent();
        String x = i.getStringExtra(Intent.EXTRA_TEXT);
        tvGuts.setText(x);

        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(a);
            }
        });
    }
}