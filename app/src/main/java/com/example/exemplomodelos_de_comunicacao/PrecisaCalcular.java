package com.example.exemplomodelos_de_comunicacao;

import android.widget.TextView;

public class PrecisaCalcular {
    TextView tv;
    public PrecisaCalcular(TextView tv){
        this.tv=tv;
    }
    public String calculoLocal(String op){
        Calculadora calc = new Calculadora();
        String result="";
        if(op == "1"){
            result= calc.soma(20.0,20.0)+"";
        }
        if(op == "2"){
            result= calc.subtrai(20.0,20.0)+"";
        }
        if(op == "3"){
            result= calc.multiplica(20.0,20.0)+"";
        }
        if(op == "4"){
            result= calc.divide(20.0,20.0)+"";
        }
        return result;
    }

    public void calculoRemoto(String operacao){
        CalculadoraSocket shs = new CalculadoraSocket(this, "15", "15", operacao);
        shs.execute();

    }
    public void calculoRemotoHTTP(String operacao){
        CalculadoraHttpPOST shs = new CalculadoraHttpPOST(this, "15", "15", operacao);
        shs.execute();

    }
    public void result_calculoRemoto(String result){
        tv.setText(result);
    }

}
