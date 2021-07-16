package com.example.exemplomodelos_de_comunicacao;

public class Calculadora {
    public String sayHello(String nome, String sobrenome) {
        return "Fala "+ nome + " " + sobrenome;
    }
    public double soma(double oper1, double oper2) {
        return oper1 + oper2;
    }
    //função de subtração
    public double subtrai(double oper1, double oper2) {
        return oper1 - oper2;
    }
    //função de  multiplicação
    public double multiplica(double oper1, double oper2) {
        return oper1 * oper2;
    }
    //função de divisão
    public double divide(double oper1, double oper2) {
        return oper1 / oper2;
    }
}
