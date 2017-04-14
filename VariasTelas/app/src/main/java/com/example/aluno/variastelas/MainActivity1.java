package com.example.aluno.variastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {

    EditText editNome;
    EditText editIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        editNome = (EditText)findViewById(R.id.editNome);
        editIdade = (EditText)findViewById(R.id.editIdade);
    }

    public void mostrarSegundaTela(View v){
        // para exibir outras telas, usa-se a classe Intent antes
        Intent tela2 = new Intent(this, MainActivity2.class);

        String resultado = "Seu nome é "+editNome.getText()+" e sua idade é "+editIdade.getText();

        // o putExtra prepara o envio de dados para outra activity
        // o primeiro argumento é a chave, ou seja, o nome do dado
        // o segundo argumento é o valor do dado
        tela2.putExtra("resultado", resultado);

        // para exibir a tela, usa-se o startActivity()
        startActivity(tela2);
    }
}
