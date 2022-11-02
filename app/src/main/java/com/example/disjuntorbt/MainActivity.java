package com.example.disjuntorbt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent (this, Atributos.class);


        Button btCadastro = (Button) findViewById(R.id.btCadastro);
        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Disjuntores de Baixa Tensão";
                i.putExtra(Intent.EXTRA_TEXT, msg);
                startActivity(i);
                finish();
            }
        });
    }
}