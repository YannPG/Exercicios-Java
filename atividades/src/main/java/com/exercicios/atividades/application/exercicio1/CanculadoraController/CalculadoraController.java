package com.exercicios.atividades.application.exercicio1.CanculadoraController;

import com.exercicios.atividades.application.exercicio1.UseCase.DividirUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.MultiplicarUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SomaUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SubtrairUseCase;
import com.exercicios.atividades.domain.entity.CalculadoraDomain;
import com.exercicios.atividades.domain.exceptions.DividirException;
import com.exercicios.atividades.domain.exceptions.ValorInvalidoException;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.Scanner;

public class CalculadoraController implements ControllerInterface {

    private final DividirUseCase dividirUseCase;
    private final MultiplicarUseCase multiplicarUseCase;
    private final SomaUseCase somaUseCase;
    private final SubtrairUseCase subtrairUseCase;
    private final Scanner scanner;

    public CalculadoraController(
            DividirUseCase dividirUseCase,
            MultiplicarUseCase multiplicarUseCase,
            SomaUseCase somaUseCase,
            SubtrairUseCase subtrairUseCase,
            Scanner scanner
    ) {
        this.dividirUseCase = dividirUseCase;
        this.multiplicarUseCase = multiplicarUseCase;
        this.somaUseCase = somaUseCase;
        this.subtrairUseCase = subtrairUseCase;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        int opcao;
        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Voltar");
            System.out.print("Operação: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao >= 1 && opcao <= 4) {
                try {
                    System.out.print("Primeiro valor: ");
                    Double valor1 = scanner.nextDouble();
                    System.out.print("Segundo valor: ");
                    Double valor2 = scanner.nextDouble();

                    CalculadoraDomain calculo = new CalculadoraDomain(valor1, valor2);

                    switch (opcao) {
                        case 1:
                            System.out.println("Resultado da Soma: " + somaUseCase.somar(calculo));
                            break;
                        case 2:
                            System.out.println("Resultado da Subtração: " + subtrairUseCase.subtrair(calculo));
                            break;
                        case 3:
                            System.out.println("Resultado da Multiplicação: " + multiplicarUseCase.multiplicar(calculo));
                            break;
                        case 4:
                            System.out.println("Resultado da Divisão: " + dividirUseCase.dividir(calculo));
                            break;
                    }
                } catch (DividirException e) {
                    System.out.println("\nErro de Negócio: " + e.getMessage());
                    System.out.println(
                            "\nTentativa de calcular: " + e.getNumerador() + " / " + e.getDenominador()
                    );
                } catch (ValorInvalidoException e) {
                    System.out.println("Erro de Negócio: " + e.getMessage());
                }
            }
        } while (opcao != 0);
    }
}