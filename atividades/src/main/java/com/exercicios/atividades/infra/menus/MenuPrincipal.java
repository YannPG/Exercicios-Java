package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuPrincipal implements MenuInterface {

    private final MenuInterface proximoMenu;
    private final MenuInterface menuMatriz;
    private final MenuInterface menuManipulacaoObjetos;
    private final MenuInterface menuClassesObjetos;
    private final Scanner scanner;

    public MenuPrincipal(Scanner scanner, MenuInterface proximoMenu, MenuInterface menuMatriz, MenuInterface menuManipulacaoObjetos, MenuInterface menuClassesObjetos) {
        this.scanner = scanner;
        this.proximoMenu = proximoMenu;
        this.menuMatriz = menuMatriz;
        this.menuManipulacaoObjetos = menuManipulacaoObjetos;
        this.menuClassesObjetos = menuClassesObjetos;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1. Métodos");
            System.out.println("2. Matriz");
            System.out.println("3. Manipulação de objetos");
            System.out.println("4. Classes e Objetos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                this.proximoMenu.exibir();
            }
            if (opcao == 2){
                this.menuMatriz.exibir();
            }
            if(opcao == 3){
                this.menuManipulacaoObjetos.exibir();
            }
            if(opcao == 4){
                this.menuClassesObjetos.exibir();
            }

        } while (opcao != 0);
    }
}