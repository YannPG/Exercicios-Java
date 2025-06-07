package com.exercicios.atividades;

import com.exercicios.atividades.application.exercicio1.CanculadoraController.CalculadoraController;
import com.exercicios.atividades.application.exercicio1.UseCase.DividirUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.MultiplicarUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SomaUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SubtrairUseCase;
import com.exercicios.atividades.infra.menus.MenuMetodo;
import com.exercicios.atividades.infra.menus.MenuPrincipal;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class AtividadesApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SomaUseCase somaUseCase = new SomaUseCase();
		SubtrairUseCase subtrairUseCase = new SubtrairUseCase();
		MultiplicarUseCase multiplicarUseCase = new MultiplicarUseCase();
		DividirUseCase dividirUseCase = new DividirUseCase();

		ControllerInterface calculadoraController = new CalculadoraController(
				dividirUseCase,
				multiplicarUseCase,
				somaUseCase,
				subtrairUseCase,
				scanner
		);

		MenuInterface menuMetodos = new MenuMetodo(scanner, calculadoraController);
		MenuInterface menuPrincipal = new MenuPrincipal(scanner, menuMetodos);

		menuPrincipal.exibir();

		System.out.println("Aplicação encerrada.");
		scanner.close();
	}
}