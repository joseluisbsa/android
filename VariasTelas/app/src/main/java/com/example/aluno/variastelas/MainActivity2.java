package com.example.aluno.variastelas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textoResultado = (TextView)findViewById(R.id.textoResultado);

        // recebendo dados de uma tela anterior
        String resultado = getIntent().getStringExtra("resultado");

        textoResultado.setText(resultado);
    }
}
