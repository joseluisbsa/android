package com.example.aluno.exercicio03_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Exercicio_03_2 extends AppCompatActivity {

    EditText numero01;
    EditText numero02;
    Switch chave01;
    Button calcular;

    TextView texto01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_03_2);

        numero01 = (EditText)findViewById(R.id.numero01);
        numero02 = (EditText) findViewById(R.id.numero02);

        calcular = (Button) findViewById(R.id.calcular);
        chave01 = (Switch)findViewById(R.id.chave01);
    }

    public void cliqueCalcular(View v){

        double num1 = Double.valueOf(numero01.getText().toString());
        double num2 = Double.valueOf(numero02.getText().toString());
        String mensagem = null;
        String paraPassar = "0"; // guarda "9" ou "6"
        String resultado = null; // guarda APROVADO ou REPROVADO
        
        double media = (num1 + num2) / 2;

        if(chave01.isChecked()){
            paraPassar = "9";
            if(media >= 9){
                resultado = "APROVADO."
            }else {
                resultado = "REPROVADO."
            }
        }
        else{
            paraPassar = "6";
            if(media >= 6){
                resultado = "APROVADO."
            }else{
                resultado = "REPROVADO."
            }
        }
            
        mensagem = "Sua média foi "+media+" . Para passar é "+paraPassar+" . Você foi "+resultado;
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}
