package com.example.disjuntorbt;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        TextInputEditText id = (TextInputEditText) findViewById(R.id.itId);
        TextInputEditText nS = (TextInputEditText) findViewById(R.id.itSN);
        TextInputEditText fab = (TextInputEditText) findViewById(R.id.itFab);
        Button send = (Button) findViewById(R.id.send);
        TextView res = (TextView) findViewById(R.id.tvShowR);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String idV = id.getText().toString();
                String nSV = nS.getText().toString();
                String fabric = fab.getText().toString();

                String result ="Identificação: ".concat(idV).concat("\nNúmero de Série: ".concat(nSV).concat("\nFabicante: ".concat(fabric)));

                res.setText(result);

            }
        });


    }
}