package com.example.disjuntorbt;

import static java.lang.String.valueOf;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        TextInputEditText id = (TextInputEditText) findViewById(R.id.itId);
        TextInputEditText nS = (TextInputEditText) findViewById(R.id.itSN);
        TextInputEditText fab = (TextInputEditText) findViewById(R.id.itFab);
        TextInputEditText iNom = (TextInputEditText) findViewById(R.id.itiNom);
        TextInputEditText vNom = (TextInputEditText)findViewById(R.id.itvNom);
        TextView show = (TextView) findViewById(R.id.tvResultado);
        Button send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisjuntorBT x = new DisjuntorBT();
                x.tag = id.getText().toString();
                x.nSerie = nS.getText().toString();
                x.fabricante = fab.getText().toString();
                x.iNominal = Double.parseDouble(iNom.getText().toString());
                x.vNominal = Double.parseDouble(vNom.getText().toString());

                Toast t = Toast.makeText(getApplicationContext(), "Dados processados com sucesso!!!", Toast.LENGTH_LONG);
                t.show();


                String result ="Identificação: ".concat(x.tag.concat("\nNúmero de Série: ".concat(x.nSerie.concat("\nFabicante: ".concat(x.fabricante)))))
                        + "\nCorrente Nominal: " + x.iNominal + "\nTensão Nominal: " + x.vNominal;

                show.setText(result);
            }
        });
    }
}