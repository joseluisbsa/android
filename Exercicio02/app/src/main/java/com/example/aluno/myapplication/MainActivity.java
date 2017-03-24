package com.example.aluno.myapplication;

import android.graphics.Color;
import android.support.annotation.Dimension;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botao1;
    TextView texto1;
    ImageView imagem1;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao1 = (Button)findViewById(R.id.botao1);
        texto1 = (TextView)findViewById(R.id.texto1);
        imagem1 = (ImageView)findViewById(R.id.imagem1);
        edit1 = (EditText)findViewById(R.id.edit1);

    }

    public  void mudarLoko (View v){

        double edit = Double.valueOf(edit1.getText().toString());

        if (edit <= 1000){
            texto1.setText("#partiu estudar");
        }


        else if (edit <= 3000){
            texto1.setText("#partiu classe média");
        }

        else{
            texto1.setText("#partiu ostentar");
        }

        texto1.setTextColor(Color.RED);
        texto1.setTextSize(Dimension.SP, 30f);

        imagem1.setImageResource(R.drawable.ios);
    }
}
