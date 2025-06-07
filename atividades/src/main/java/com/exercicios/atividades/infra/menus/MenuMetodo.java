package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuMetodo implements MenuInterface {

    private final ControllerInterface calculadoraController;
    private final Scanner scanner;

    public MenuMetodo(Scanner scanner, ControllerInterface calculadoraController) {
        this.scanner = scanner;
        this.calculadoraController = calculadoraController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE MÉTODOS =====");
            System.out.println("1. Calculadora Simples");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.calculadoraController.executar();
            }

        } while (opcao != 0);
    }
}