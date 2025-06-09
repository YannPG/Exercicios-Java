package com.exercicios.atividades.application.exercicio8.controller;

import com.exercicios.atividades.domain.entity.ValorContainer;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrocaValoresController implements ControllerInterface {

    private final Scanner scanner;

    public TrocaValoresController(Scanner scanner) {
        this.scanner = scanner;
    }

    private static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }

    @Override
    public void executar() {
        System.out.println("\n--- Exercício: Trocando Valores entre Objetos ---");

        try {
            ValorContainer objA = new ValorContainer();
            ValorContainer objB = new ValorContainer();

            System.out.print("Digite o valor para o objeto A: ");
            objA.valor = scanner.nextInt();

            System.out.print("Digite o valor para o objeto B: ");
            objB.valor = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nValores ANTES da troca:");
            System.out.println("Objeto A: " + objA.valor);
            System.out.println("Objeto B: " + objB.valor);

            trocarValores(objA, objB);
            System.out.println("\n...trocando valores...");

            System.out.println("\nValores DEPOIS da troca:");
            System.out.println("Objeto A: " + objA.valor);
            System.out.println("Objeto B: " + objB.valor);

        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada. Por favor, digite apenas números inteiros.");
            scanner.nextLine();
        }
    }
}