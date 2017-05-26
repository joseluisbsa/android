
package com.example.aluno.myapplication;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    EditText editCodigo;
    TextView tvTitulo;
    TextView tvConteudo;
    LerPostagemTask lerPostagemTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        lerPostagemTask = new LerPostagemTask();

        editCodigo = (EditText)findViewById(R.id.codigo);
        tvTitulo = (TextView)findViewById(R.id.titulo);
        tvConteudo = (TextView)findViewById(R.id.conteudo);
    }

    public void consultar(View v){

        Integer id = Integer.valueOf(editCodigo.getText().toString());
        Postagem postagemDaInternet = lerPostagemTask.doInBackground(id);
        if(postagemDaInternet == null)
            return;

        tvTitulo.setText(postagemDaInternet.getTitle());
        tvConteudo.setText(postagemDaInternet.getBody());
    }
}
