package br.com.bandtec.projeto02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaInicial extends AppCompatActivity {

    // Declaramos os objetos que representam os componentes da Tela
    TextView text1;    TextView text2;    TextView text3;    TextView text4;    TextView text5;

    EditText edit1;    EditText edit2;    EditText edit3;    EditText edit4;    EditText edit5;

    Button button1; TextView textExibir;

    //TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        // sempre nesse ponto do "onCreate", instanciamos os objetos dos componentes
        text1 = (TextView)findViewById(R.id.text1); // bruto
        text2 = (TextView)findViewById(R.id.text2); // INSS
        text3 = (TextView)findViewById(R.id.text3); // FGTS
        text4 = (TextView)findViewById(R.id.text4); // IR
        text5 = (TextView)findViewById(R.id.text5); // VR
        textExibir = (TextView)findViewById(R.id.textExibir);

        edit1 = (EditText)findViewById(R.id.edit1); // bruto
        edit2 = (EditText)findViewById(R.id.edit2); // INSS
        edit3 = (EditText)findViewById(R.id.edit3); // FGTS
        edit4 = (EditText)findViewById(R.id.edit4); // IR
        edit5 = (EditText)findViewById(R.id.edit5); // VR

        button1 = (Button)findViewById(R.id.button1);
        // Injetando um comportamento de evento no componente

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				
                double bruto = Double.valueOf(edit1.getText().toString());
                double inss = (Double.valueOf(edit2.getText().toString())) / 100;
                double fgts = (Double.valueOf(edit3.getText().toString())) / 100;
                double ir = (Double.valueOf(edit4.getText().toString())) / 100;
                double vr = Double.valueOf(edit5.getText().toString());

                double porc = inss + fgts + ir;
                double desc = porc * bruto;

                double liquido = (bruto - desc) + vr;
                double ferias = liquido + (bruto * 0.3);
                double dezembro = liquido + (bruto * 0.9);

                Toast.makeText(v.getContext(),"Seu salário líquido ordinário é R$" +liquido, Toast.LENGTH_SHORT).show();
                Toast.makeText(v.getContext(),"No seu mês de férias, ganha líquido R$" +ferias, Toast.LENGTH_SHORT).show();
                Toast.makeText(v.getContext(),"Em dezembro seu líquido é R$" +dezembro, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


