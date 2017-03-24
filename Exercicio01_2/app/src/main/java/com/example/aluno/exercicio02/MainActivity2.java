package com.example.aluno.exercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText editSalBruto;
    Button buttonResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editSalBruto = (EditText)findViewById(R.id.editSalBruto);
        buttonResultado = (Button)findViewById(R.id.buttonResultado);

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bruto = Double.valueOf(editSalBruto.getText().toString());
                double liquido;

                if(bruto <= 1000){
                    liquido = bruto - (0.2 * bruto); // inss: 5% ir: 15%
                }else {
                    liquido = bruto - (0.3 * bruto); // inss: 10% ir: 20%
                }

                double ferias  = liquido + (bruto*0.3);
                double dezembro = liquido + (bruto*0.9);

                Toast.makeText(v.getContext(),"Seu salário líquido ordinário é R$" +liquido, Toast.LENGTH_SHORT).show();
                Toast.makeText(v.getContext(),"No seu mês de férias, ganha líquido R$" +ferias, Toast.LENGTH_SHORT).show();
                Toast.makeText(v.getContext(),"Em dezembro seu líquido é R$" +dezembro, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
