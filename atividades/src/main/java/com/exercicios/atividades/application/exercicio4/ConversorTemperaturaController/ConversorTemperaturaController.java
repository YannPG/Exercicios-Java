package com.exercicios.atividades.application.exercicio4.ConversorTemperaturaController;

import com.exercicios.atividades.application.exercicio4.ConversorTemperaturaUseCase.CelsiusFahrenheitUseCase;
import com.exercicios.atividades.application.exercicio4.ConversorTemperaturaUseCase.FahrenheitCelsiusUseCase;
import com.exercicios.atividades.domain.entity.ConversorTemperaturaDomain;
import com.exercicios.atividades.domain.exceptions.DividirException;
import com.exercicios.atividades.domain.exceptions.ValorInvalidoException;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorTemperaturaController implements ControllerInterface {

    CelsiusFahrenheitUseCase celsiusFahrenheitUseCase;
    FahrenheitCelsiusUseCase fahrenheitCelsiusUseCase;
    Scanner scanner;


    public ConversorTemperaturaController(
            CelsiusFahrenheitUseCase celsiusFahrenheitUseCase,
            FahrenheitCelsiusUseCase fahrenheitCelsiusUseCase,
            Scanner scanner) {
        this.celsiusFahrenheitUseCase = celsiusFahrenheitUseCase;
        this.fahrenheitCelsiusUseCase = fahrenheitCelsiusUseCase;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        int opcao;
        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Celcius para fahrenheit");
            System.out.println("2. Fahrenheit para celsius");
            System.out.println("0. Voltar");
            System.out.print("Operação: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao >= 1 && opcao <= 2) {
                try {
                    System.out.print("\nDigite a temperatura: ");
                    Double temperatura = null;
                    while (temperatura == null) {
                        try {
                            temperatura = scanner.nextDouble();

                        } catch (InputMismatchException e) {
                            System.out.println("\nErro: Valor inválido. Por favor, digite apenas números.");
                            System.out.print("Tente novamente: ");
                            scanner.nextLine();
                        }
                    }
                    ConversorTemperaturaDomain temperaturaDomain = new ConversorTemperaturaDomain(temperatura);

                    switch (opcao) {
                        case 1:
                            System.out.println("Conversão de celsius para fahrenheit: " + celsiusFahrenheitUseCase.celsiusFahrenheit(temperaturaDomain.getTemperatura()));
                            break;
                        case 2:
                            System.out.println("Conversão de fahrenheit para celsius: " + fahrenheitCelsiusUseCase.fahrenheitCelsius(temperaturaDomain.getTemperatura()));
                            break;
                    }
                } catch (DividirException e) {
                    System.out.println("\nErro de Negócio: " + e.getMessage());
                    System.out.println(
                            "\nTentativa de calcular: " + e.getNumerador() + " / " + e.getDenominador()
                    );
                } catch (ValorInvalidoException e) {
                    System.out.println("Erro de Negócio: " + e.getMessage());
                }
            }
        } while (opcao != 0);
    }
}
