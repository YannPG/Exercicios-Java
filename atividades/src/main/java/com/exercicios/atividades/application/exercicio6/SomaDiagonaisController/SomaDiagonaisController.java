package com.exercicios.atividades.application.exercicio6.SomaDiagonaisController;

import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase.InserirMatrizUseCase;
import com.exercicios.atividades.application.exercicio6.SomaDiagonaisUseCase.SomaDiagonaisUseCase;
import com.exercicios.atividades.domain.entity.MatrizDomain;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class SomaDiagonaisController implements ControllerInterface {

    private final InserirMatrizUseCase inserirMatrizUseCase;
    private final SomaDiagonaisUseCase somadiagonaisUseCase;
    private final Scanner scanner;


    public SomaDiagonaisController(InserirMatrizUseCase inserirMatrizUseCase,SomaDiagonaisUseCase somadiagonaisUseCase, Scanner scanner) {
        this.inserirMatrizUseCase = inserirMatrizUseCase;
        this.somadiagonaisUseCase = somadiagonaisUseCase;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        try {
            System.out.println("\n--- Análise de Matriz: Soma das diagonais" +
                    " ---");

            System.out.print("Qual será o tamanho da matriz? ");
            int linha = scanner.nextInt();

            Integer[][] matrizArray = new Integer[linha][linha];
            inserirMatrizUseCase.inserirMatrizUseCase(matrizArray, linha, linha, scanner);

            MatrizDomain matrizDomain = new MatrizDomain(matrizArray);

            Map<String,Integer> resultado = somadiagonaisUseCase.somaDiagonaisUseCase(matrizDomain);

            System.out.println("\nA soma da diagonal principal é: " + resultado.get("primaria"));
            System.out.println("\nA soma da diagonal secundaria é: " + resultado.get("secundaria"));

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println("Erro na criação ou análise da matriz: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada: um valor inválido foi digitado para as dimensões.");
            scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
