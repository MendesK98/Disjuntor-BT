package com.example.disjuntorbt;

import static java.lang.String.valueOf;

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
        TextInputEditText vN = (TextInputEditText) findViewById(R.id.itvNom);
        TextInputEditText iN = (TextInputEditText) findViewById(R.id.itiNom);
        TextView show = (TextView) findViewById(R.id.tvResultado);
        Button send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisjuntorBT x = new DisjuntorBT();
                x.tag = id.getText().toString();
                x.nSerie = nS.getText().toString();
                x.fabricante = fab.getText().toString();


                String iNS = Integer.toString(x.iNominal); //Verificando a necessidade de conversão de tipo dos valores para apresentar resultados
                String vNS = Integer.toString(x.vNominal);

                //RESOLVER APRESENTAÇÃO DOS RESULTADOS DE VALORES INTEIROS (TENSÃO E CORRENTE NOMINAIS)
                String result ="Identificação: ".concat(x.tag).concat("\nNúmero de Série: ".concat(x.nSerie).concat("\nFabicante: "
                        .concat(x.fabricante)).concat("\nCorrente Nominal: ").concat(iNS).concat("\nTensao Nominal: ").concat(vNS));

                show.setText(result);
            }
        });
    }
}