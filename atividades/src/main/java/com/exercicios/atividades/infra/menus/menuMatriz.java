package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class menuMatriz implements MenuInterface {

    private final Scanner scanner;
    private final ControllerInterface matrizMaiorMenorController;

    public menuMatriz(Scanner scanner,ControllerInterface matrizMaiorMenorController) {
        this.scanner = scanner;
        this.matrizMaiorMenorController = matrizMaiorMenorController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE MATRIZ =====");
            System.out.println("1. Verificar maior e menor dentro da matriz");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.matrizMaiorMenorController.executar();
            }
        } while (opcao != 0);
    }
}
