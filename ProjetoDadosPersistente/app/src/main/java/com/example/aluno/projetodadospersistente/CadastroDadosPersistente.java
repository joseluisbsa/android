package com.example.aluno.projetodadospersistente;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroDadosPersistente extends AppCompatActivity {

    EditText editNome;
    EditText editValor;

    // usado para armazenar dados local no celular
    // aquela memoria que fica sempre quando vc vai apagar dados
    SharedPreferences preferences;
    SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_dados_persistente);

        editNome = (EditText)findViewById(R.id.editNome);
        editValor = (EditText)findViewById(R.id.editValor);

        // PRIVATE_MODE só a aplicação vai conseguir acessar esses dados
        // "MinhaApp" nome do local onde sera guardado os dados
        preferences = getSharedPreferences("MinhaApp", Context.MODE_PRIVATE);
        edit = preferences.edit();

        //recuperando os dados persistidos caso já existam
        if(preferences.contains("nome_usuario")){
            editNome.setText(preferences.getString("nome_usuario", ""));
        }

        if(preferences.contains("valor_guardado")){
            editValor.setText(String.valueOf(preferences.getFloat("valor_guardado", 0)));
        }
    }

    public void salvarDados(View v){

        // persistindo o "nome_usuario"
        edit.putString("nome_usuario", editNome.getText().toString());

        // persistindo o "valor_guardado"
        edit.putFloat("valor_guardado", Float.valueOf(editValor.getText().toString()));

        // salvando em disco (internal storage)
        edit.apply();
    }

    public void limparDados(View v){
        edit.clear();
        edit.apply();
    }
}
