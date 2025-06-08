package com.exercicios.atividades.infra.menus;

import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class MenuMetodo implements MenuInterface {

    private final ControllerInterface calculadoraController;
    private final ControllerInterface verificarPalindromoController;
    private final ControllerInterface calcularFatorialController;
    private final ControllerInterface conversorTemperaturaController;
    private final Scanner scanner;

    public MenuMetodo(Scanner scanner, ControllerInterface calculadoraController, ControllerInterface verificarPalindromoController, ControllerInterface calcularFatorialController,ControllerInterface conversorTemperaturaController) {
        this.scanner = scanner;
        this.calculadoraController = calculadoraController;
        this.verificarPalindromoController = verificarPalindromoController;
        this.calcularFatorialController = calcularFatorialController;
        this.conversorTemperaturaController = conversorTemperaturaController;
    }

    @Override
    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU DE MÉTODOS =====");
            System.out.println("1. Calculadora Simples");
            System.out.println("2. Verifica Palíndromos");
            System.out.println("3. Calcular Fatorial");
            System.out.println("4. Conversor de temperaturas");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = this.scanner.nextInt();
            this.scanner.nextLine();

            if (opcao == 1) {
                this.calculadoraController.executar();
            }
            if(opcao == 2){
                this.verificarPalindromoController.executar();
            }
            if(opcao == 3){
                this.calcularFatorialController.executar();
            }
            if(opcao == 4){
                this.conversorTemperaturaController.executar();
            }

        } while (opcao != 0);
    }
}