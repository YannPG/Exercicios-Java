package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuPrincipal implements MenuInterface {

    private final MenuInterface proximoMenu;
    private final Scanner scanner;

    public MenuPrincipal(Scanner scanner, MenuInterface proximoMenu) {
        this.scanner = scanner;
        this.proximoMenu = proximoMenu;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1. Métodos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                this.proximoMenu.exibir();
            }

        } while (opcao != 0);
    }
}