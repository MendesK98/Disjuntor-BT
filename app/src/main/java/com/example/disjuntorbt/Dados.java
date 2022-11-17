package com.example.disjuntorbt;

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
        TextInputEditText numeroSerie = (TextInputEditText) findViewById(R.id.itSN);
        TextInputEditText fabricante = (TextInputEditText) findViewById(R.id.itFab);
        TextInputEditText iNominal = (TextInputEditText) findViewById(R.id.itiNom);
        TextInputEditText vNominal = (TextInputEditText)findViewById(R.id.itvNom);
        TextInputEditText interrupcao = (TextInputEditText)findViewById(R.id.itInterrupcao);
        TextInputEditText tipoDisjuntor = (TextInputEditText)findViewById(R.id.itTipo);
        TextInputEditText tipoRele = (TextInputEditText)findViewById(R.id.itTipoRele);
        TextInputEditText iNominalRele = (TextInputEditText)findViewById(R.id.itINRele);
        TextView show = (TextView) findViewById(R.id.tvResultado);
        Button send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisjuntorBT x = new DisjuntorBT();
                x.setTag(id.getText().toString());
                x.setnSerie(numeroSerie.getText().toString());
                x.setFabricante(fabricante.getText().toString());
                x.setiNominal(Double.parseDouble(iNominal.getText().toString()));
                x.setvNominal(Double.parseDouble(vNominal.getText().toString()));
                x.setInterrupcao(Double.parseDouble(interrupcao.getText().toString()));
                x.setTipo(tipoDisjuntor.getText().toString());
                x.setTipoRele(tipoRele.getText().toString());
                x.setINominalRele(Double.parseDouble(iNominalRele.getText().toString()));

                Toast t = Toast.makeText(getApplicationContext(), "Dados processados com sucesso!!!", Toast.LENGTH_LONG);
                t.show();

                String result ="Identificação: ".concat(x.tag.concat("\nNúmero de Série: ".concat(x.nSerie.concat("\nFabicante: ".concat(x.fabricante)))))
                        + "\nCorrente Nominal: " + x.iNominal + "\nTensão Nominal: " + x.vNominal + "\nInterrupção: " + x.interrupcao + "\nTipo do Disjuntor: " + x.tipo
                        + "\nTipo do Relé: " + x.tipoRele + "\nCorrente Nominal do Relé: " + x.iNominalRele;

                show.setText(result);

            }
        });
    }
}