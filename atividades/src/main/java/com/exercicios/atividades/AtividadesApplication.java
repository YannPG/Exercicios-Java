package com.exercicios.atividades;

import com.exercicios.atividades.application.exercicio1.CanculadoraController.CalculadoraController;
import com.exercicios.atividades.application.exercicio1.UseCase.DividirUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.MultiplicarUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SomaUseCase;
import com.exercicios.atividades.application.exercicio1.UseCase.SubtrairUseCase;
import com.exercicios.atividades.application.exercicio2.UseCase.VerificarPalindromoUseCase;
import com.exercicios.atividades.application.exercicio2.VerificarPalindromos.VerificarPalindromoController;
import com.exercicios.atividades.application.exercicio3.FatorialController.FatorialController;
import com.exercicios.atividades.application.exercicio3.FatorialUseCase.CalcularFatorialUseCase;
import com.exercicios.atividades.application.exercicio4.ConversorTemperaturaController.ConversorTemperaturaController;
import com.exercicios.atividades.application.exercicio4.ConversorTemperaturaUseCase.CelsiusFahrenheitUseCase;
import com.exercicios.atividades.application.exercicio4.ConversorTemperaturaUseCase.FahrenheitCelsiusUseCase;
import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizController.matrizController;
import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase.InserirMatrizUseCase;
import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase.MaiorMenorElementoUseCase;
import com.exercicios.atividades.application.exercicio6.SomaDiagonaisController.SomaDiagonaisController;
import com.exercicios.atividades.application.exercicio6.SomaDiagonaisUseCase.SomaDiagonaisUseCase;
import com.exercicios.atividades.application.exercicio7.controller.ExerciciosDadosObjetoController;
import com.exercicios.atividades.application.exercicio8.controller.TrocaValoresController;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioController.FuncionarioController;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.CadastrarFuncionarioUseCase;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.CalcularSalarioDepartamentoUseCase;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.ListarFuncionarioUseCase;
import com.exercicios.atividades.domain.repository.FuncionarioRepository;
import com.exercicios.atividades.infra.menus.*;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;
import com.exercicios.atividades.infra.interfaces.MenuInterface;

import java.util.Scanner;

public class AtividadesApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Calculadora
		SomaUseCase somaUseCase = new SomaUseCase();
		SubtrairUseCase subtrairUseCase = new SubtrairUseCase();
		MultiplicarUseCase multiplicarUseCase = new MultiplicarUseCase();
		DividirUseCase dividirUseCase = new DividirUseCase();
		//Verificar Palindromo
		VerificarPalindromoUseCase verificarPalindromoUseCase = new VerificarPalindromoUseCase();
		//Calcular Fatorial
		CalcularFatorialUseCase calcularFatorialUseCase = new CalcularFatorialUseCase();
		//Converter Temperatura
		CelsiusFahrenheitUseCase celsiusFahrenheitUseCase = new CelsiusFahrenheitUseCase();
		FahrenheitCelsiusUseCase fahrenheitCelsiusUseCase = new FahrenheitCelsiusUseCase();

		//Matriz
		InserirMatrizUseCase inserirMatrizUseCase = new InserirMatrizUseCase();
		MaiorMenorElementoUseCase maiorMenorElementoUseCase = new MaiorMenorElementoUseCase();
		//Somar Diagonais
		SomaDiagonaisUseCase somaDiagonaisUseCase = new SomaDiagonaisUseCase();

		//Classe e objetos
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		ListarFuncionarioUseCase listarFuncionariosUseCase = new ListarFuncionarioUseCase(funcionarioRepository);
		CalcularSalarioDepartamentoUseCase calcularSalarioDepartamentoUseCase = new CalcularSalarioDepartamentoUseCase(funcionarioRepository);
		CadastrarFuncionarioUseCase cadastrarFuncionarioUseCase = new CadastrarFuncionarioUseCase(funcionarioRepository);

		ControllerInterface calculadoraController = new CalculadoraController(
				dividirUseCase,
				multiplicarUseCase,
				somaUseCase,
				subtrairUseCase,
				scanner
		);

		ControllerInterface verificarPalindromoController = new VerificarPalindromoController(
				verificarPalindromoUseCase,
				scanner
		);

		ControllerInterface calcularFatorialController = new FatorialController(
				calcularFatorialUseCase,
				scanner
		);

		ControllerInterface converterTemperaturaController = new ConversorTemperaturaController(
				celsiusFahrenheitUseCase,
				fahrenheitCelsiusUseCase,
				scanner
		);

		ControllerInterface matrizController = new matrizController(
				inserirMatrizUseCase,
				maiorMenorElementoUseCase,
				scanner
		);

		ControllerInterface somaDiagonaisController = new SomaDiagonaisController(
				inserirMatrizUseCase,
				somaDiagonaisUseCase,
				scanner
		);

		ControllerInterface exerciciosDadosObjetoController = new ExerciciosDadosObjetoController();

		ControllerInterface trocaValoresController = new TrocaValoresController(scanner);

		ControllerInterface gerenciamentoFuncionarioController = new FuncionarioController(scanner, listarFuncionariosUseCase, calcularSalarioDepartamentoUseCase, cadastrarFuncionarioUseCase);

		MenuInterface menuMetodos = new MenuMetodo(scanner, calculadoraController, verificarPalindromoController, calcularFatorialController, converterTemperaturaController);
		MenuInterface menuMatriz = new MenuMatriz(scanner, matrizController,somaDiagonaisController);
		MenuInterface menuManipulacaoObjetos = new MenuManipulacaoObjetos(scanner, exerciciosDadosObjetoController, trocaValoresController);
		MenuInterface menuClassesObjetos = new MenuClassesObjetos(scanner, gerenciamentoFuncionarioController);
		MenuInterface menuPrincipal = new MenuPrincipal(scanner, menuMetodos, menuMatriz, menuManipulacaoObjetos, menuClassesObjetos);

		menuPrincipal.exibir();

		System.out.println("Aplicação encerrada.");
		scanner.close();
	}
}