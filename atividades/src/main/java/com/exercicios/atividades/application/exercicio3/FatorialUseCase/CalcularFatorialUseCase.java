package com.exercicios.atividades.application.exercicio3.FatorialUseCase;

public class CalcularFatorialUseCase {
    public Long calcularFatorial(Long numero){
        if(numero == 0 || numero == 1)
            return 1L;
        return numero * calcularFatorial(numero - 1);
    }
}
