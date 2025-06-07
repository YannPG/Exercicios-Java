package com.exercicios.atividades.domain.entity;

import com.exercicios.atividades.domain.exceptions.ValorInvalidoException;

public class CalculadoraDomain {

    private final Double valor1;
    private final Double valor2;

    public CalculadoraDomain(Double valor1, Double valor2) {
        if (valor1 == null || valor2 == null) {
            throw new ValorInvalidoException("Nenhum dos valores pode ser nulo.");
        }
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Double getValor1() {
        return valor1;
    }

    public Double getValor2() {
        return valor2;
    }
}