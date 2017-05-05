package com.example.aluno.telainicial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class TelaInicial extends AppCompatActivity {

    int idade = 16;
    String nome = "Ze Ruela";

    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        texto1 = (TextView)findViewById(R.id.texto1);
        String msg = getString(R.string.msg_loka, nome, idade);
        texto1.setText(msg);
    }
}
