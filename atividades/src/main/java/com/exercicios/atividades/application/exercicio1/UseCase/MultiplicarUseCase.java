package com.exercicios.atividades.application.exercicio1.UseCase;

import com.exercicios.atividades.domain.entity.CalculadoraDomain;

public class MultiplicarUseCase {
    public Double multiplicar(CalculadoraDomain calculo) {
        return calculo.getValor1() * calculo.getValor2();
    }
}