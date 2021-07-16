package com.example.exemplomodelos_de_comunicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btSoma = findViewById(R.id.button1); //Criação do objeto do tipo botão referente a soma
        Button btSubtracao = findViewById(R.id.button2); //Criação do objeto do tipo botão referente a subtração
        Button btMultiplicacao = findViewById(R.id.button3); //Criação do objeto do tipo botão referente a multiplicação
        Button btDivisao = findViewById(R.id.button4); //Criação do objeto do tipo botão referente a divisão
        tv= findViewById(R.id.textView);
        btSoma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               PrecisaCalcular shc = new PrecisaCalcular(tv);
               //shc.calculoRemoto();
                //shc.calculoLocal()
                shc.calculoRemotoHTTP("1");
            }

        });
        btSubtracao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               PrecisaCalcular shc = new PrecisaCalcular(tv);
               //shc.calculoRemoto();
                //shc.calculoLocal()
                shc.calculoRemotoHTTP("2");
            }

        });
        btMultiplicacao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               PrecisaCalcular shc = new PrecisaCalcular(tv);
               //shc.calculoRemoto();
                //shc.calculoLocal()
                shc.calculoRemotoHTTP("3");
            }

        });
        btDivisao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               PrecisaCalcular shc = new PrecisaCalcular(tv);
               //shc.calculoRemoto();
                //shc.calculoLocal()
                shc.calculoRemotoHTTP("4");
            }

        });
    }
}
