package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuManipulacaoObjetos implements MenuInterface {

    private final Scanner scanner;
    private final ControllerInterface exercicioDadosObjetoController;
    private final ControllerInterface trocaValoresController;


    public MenuManipulacaoObjetos(Scanner scanner, ControllerInterface exercicioDadosObjetoController, ControllerInterface trocaValoresController) {
        this.scanner = scanner;
        this.exercicioDadosObjetoController = exercicioDadosObjetoController;
        this.trocaValoresController = trocaValoresController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE OBJETOS =====");
            System.out.println("1. Manipulando Dados de um Objeto\n");
            System.out.println("2. Trocando Valores\n");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.exercicioDadosObjetoController.executar();
            }
            if (opcao == 2){
                this.trocaValoresController.executar();
            }

        } while (opcao != 0);
    }
}
