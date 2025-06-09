package com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InserirMatrizUseCase {

    public void inserirMatrizUseCase(Integer[][] matriz, Integer linha, Integer coluna, Scanner scanner) {
        System.out.println("\n--- Inserindo Valores na Matriz ---");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                Integer valor = null;
                while (valor == null) {
                    System.out.print("Digite o valor da posição a[" + i + "][" + j + "]: ");
                    try {
                        valor = scanner.nextInt();
                        matriz[i][j] = valor;
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Entrada inválida. Por favor, digite apenas um número inteiro.");
                        scanner.nextLine();
                    }
                }
            }
        }
        System.out.println("Matriz preenchida com sucesso!");
    }
}