package com.example.aluno.exercicio03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;



public class Exercicio03 extends AppCompatActivity {

    String mensagem = null;
    int contador = 0;
    TextView texto1;
    Switch chave01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03);
        texto1 = (TextView)findViewById(R.id.texto1);
        chave01 = (Switch)findViewById(R.id.chave01);
    }

    public void cliqueLoko(View v){
        // identificando o componente que chamou o metodo

        switch (v.getId()){
            case R.id.botao1:
                mensagem="Botão num 01";
                break;
            case R.id.botao2:
                mensagem="Botao num 02";
        }
        mensagem = "Você clicou no "+mensagem;
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();

        contador++;
        texto1.setText("Você clicou "+contador+" vezes!");

        // se o switch estiver "checked", está na posição "ligado"
        if(chave01.isChecked()){
            texto1.setText("O quadrado do contador é "+(contador*contador));
        }
    }
}
