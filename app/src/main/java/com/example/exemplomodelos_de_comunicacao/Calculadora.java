package com.example.exemplomodelos_de_comunicacao;

public class Calculadora {
    public String sayHello(String nome, String sobrenome) {
        return "Fala "+ nome + " " + sobrenome;
    }
    public double soma(double oper1, double oper2) {
        return oper1 + oper2;
    }
    //fun��o de subtra��o
    public double subtrai(double oper1, double oper2) {
        return oper1 - oper2;
    }
    //fun��o de  multiplica��o
    public double multiplica(double oper1, double oper2) {
        return oper1 * oper2;
    }
    //fun��o de divis�o
    public double divide(double oper1, double oper2) {
        return oper1 / oper2;
    }
}
