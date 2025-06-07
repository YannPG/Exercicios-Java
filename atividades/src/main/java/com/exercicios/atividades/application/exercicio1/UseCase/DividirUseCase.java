package com.exercicios.atividades.application.exercicio1.UseCase;

import com.exercicios.atividades.domain.entity.CalculadoraDomain;
import com.exercicios.atividades.domain.exceptions.DividirException;

public class DividirUseCase {
    public Double dividir(CalculadoraDomain calculo) {
        if (calculo.getValor2() == 0) {
            throw new DividirException(
                    "Impossível realizar divisão por zero.",
                    calculo.getValor1(),
                    calculo.getValor2()
            );
        }
        return calculo.getValor1() / calculo.getValor2();
    }
}