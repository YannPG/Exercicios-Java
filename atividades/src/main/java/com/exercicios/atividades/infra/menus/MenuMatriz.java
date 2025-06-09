package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuMatriz implements MenuInterface {

    private final Scanner scanner;
    private final ControllerInterface matrizMaiorMenorController;
    private final ControllerInterface somaDiagonalController;

    public MenuMatriz(Scanner scanner, ControllerInterface matrizMaiorMenorController, ControllerInterface somaDiagonalController) {
        this.scanner = scanner;
        this.matrizMaiorMenorController = matrizMaiorMenorController;
        this.somaDiagonalController = somaDiagonalController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE MATRIZ =====");
            System.out.println("1. Verificar maior e menor dentro da matriz");
            System.out.println("2. Calcular diagonal principal e secundária");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.matrizMaiorMenorController.executar();
            }
            if (opcao == 2){
                this.somaDiagonalController.executar();
            }

        } while (opcao != 0);
    }
}
