package com.exercicios.atividades.domain.entity;

public class Numero {
    private int valor;

    public void setValor(int novoValor) {
        this.valor = novoValor;
    }

    public void imprimirValor() {
        System.out.println("O valor do atributo é: " + this.valor);
    }
}