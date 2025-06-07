package com.exercicios.atividades.application.exercicio1.UseCase;

import com.exercicios.atividades.domain.entity.CalculadoraDomain;

public class SubtrairUseCase {
    public Double subtrair(CalculadoraDomain calculo) {
        return calculo.getValor1() - calculo.getValor2();
    }
}