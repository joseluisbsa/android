package com.br.lucas.exercicio04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaInicial extends AppCompatActivity {

    EditText edite1;
    EditText edite2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        edite1 = (EditText) findViewById(R.id.edite1);
        edite2 = (EditText) findViewById(R.id.edite2);
    }

    public void Clicou (View v)
    {
        double primeiro = Double.valueOf(edite1.getText().toString());
        double segundo = Double.valueOf(edite2.getText().toString());

        double soma = primeiro + segundo;
        double subtracao = primeiro - segundo;
        double divisao = primeiro / segundo;
        double multiplicacao = primeiro * segundo;

        Intent segundaTela = new Intent(this, segundaTela.class);

        String resultado = "\nA soma é "+soma+
                "\nA subtração é "+subtracao+
                "\nA divisão é "+ divisao+
                "\nA multiplicação é "+ multiplicacao;

        segundaTela.putExtra("resultado", resultado);

        startActivity(segundaTela);
    }
}
