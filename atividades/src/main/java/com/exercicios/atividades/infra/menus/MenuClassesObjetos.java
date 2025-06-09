package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuClassesObjetos implements MenuInterface {

    private final Scanner scanner;
    private final ControllerInterface funcionarioController;
    private final ControllerInterface agendaContatoController;


    public MenuClassesObjetos(Scanner scanner, ControllerInterface funcionarioController, ControllerInterface agendaContatoController) {
        this.scanner = scanner;
        this.funcionarioController = funcionarioController;
        this.agendaContatoController = agendaContatoController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE CLASSES E OBJETOS =====");
            System.out.println("1. Sistema de Gerenciamento de Funcionários");
            System.out.println("2. Agenda de Contatos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.funcionarioController.executar();
            }
            if (opcao == 2) {
                this.agendaContatoController.executar();
            }

        } while (opcao != 0);
    }
}