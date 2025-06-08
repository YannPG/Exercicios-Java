package com.exercicios.atividades.application.exercicio3.FatorialController;

import com.exercicios.atividades.application.exercicio3.FatorialUseCase.CalcularFatorialUseCase;
import com.exercicios.atividades.domain.entity.FatorialDomain;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.Scanner;

public class FatorialController implements ControllerInterface {

    private final CalcularFatorialUseCase calcularFatorialUseCase;

    private final Scanner scanner;

    public FatorialController(
            CalcularFatorialUseCase calcularFatorialUseCase,
            Scanner scanner) {
        this.calcularFatorialUseCase = calcularFatorialUseCase;
        this.scanner = scanner;
    }

    @Override
    public void executar(){
        System.out.println("\nDigite o valor que deseja calcular o fatorial: ");
        FatorialDomain domain = new FatorialDomain(scanner.nextLong());
        Long numeroCalculado = this.calcularFatorialUseCase.calcularFatorial(domain.getnumero());
        System.out.println("Resultado da fatorial: " + numeroCalculado);
    }
}
