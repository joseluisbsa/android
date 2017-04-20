package com.br.lucas.exercicio04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundaTela extends AppCompatActivity {

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        textoResultado = (TextView) findViewById(R.id.textoResultado);

        String resul = getIntent().getStringExtra("Resultado");

        textoResultado.setText(resul);
    }
}
