package com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizController;

import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase.InserirMatrizUseCase;
import com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase.MaiorMenorElementoUseCase;
import com.exercicios.atividades.domain.entity.MatrizDomain;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class matrizController implements ControllerInterface {

    private final InserirMatrizUseCase inserirMatrizUseCase;
    private final MaiorMenorElementoUseCase maiorMenorElementoUseCase;
    private final Scanner scanner;

    public matrizController(
            InserirMatrizUseCase inserirMatrizUseCase,
            MaiorMenorElementoUseCase maiorMenorElementoUseCase,
            Scanner scanner
    ) {
        this.inserirMatrizUseCase = inserirMatrizUseCase;
        this.maiorMenorElementoUseCase = maiorMenorElementoUseCase;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        try {
            System.out.println("\n--- Análise de Matriz: Maior e Menor Elemento ---");

            System.out.print("Qual será o tamanho da linha? ");
            int linha = scanner.nextInt();
            System.out.print("Qual será o tamanho da coluna? ");
            int coluna = scanner.nextInt();

            Integer[][] matrizArray = new Integer[linha][coluna];
            inserirMatrizUseCase.inserirMatrizUseCase(matrizArray, linha, coluna, scanner);

            MatrizDomain matrizDomain = new MatrizDomain(matrizArray);

            Map<String, Integer> resultado = maiorMenorElementoUseCase.encontrar(matrizDomain);
            Integer maiorElemento = resultado.get("maior");
            Integer menorElemento = resultado.get("menor");

            System.out.println("\n--- Análise Concluída ---");
            System.out.println("O MAIOR elemento na matriz é: " + maiorElemento);
            System.out.println("O MENOR elemento na matriz é: " + menorElemento);

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println("Erro na criação ou análise da matriz: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada: um valor inválido foi digitado para as dimensões.");
            scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
