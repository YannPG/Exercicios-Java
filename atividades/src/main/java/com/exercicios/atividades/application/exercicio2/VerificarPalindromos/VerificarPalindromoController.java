package com.exercicios.atividades.application.exercicio2.VerificarPalindromos;


import com.exercicios.atividades.application.exercicio2.UseCase.VerificarPalindromoUseCase;
import com.exercicios.atividades.domain.entity.PalindromoDomain;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.Scanner;

public class VerificarPalindromoController implements ControllerInterface {

    private final VerificarPalindromoUseCase verificarPalindromoUseCase;
    private final Scanner scanner;

    public VerificarPalindromoController(
            VerificarPalindromoUseCase verificarPalindromoUseCase,
            Scanner scanner) {
        this.verificarPalindromoUseCase = verificarPalindromoUseCase;
        this.scanner = scanner;
    }

    public void executar(){
        System.out.print("\n Digite a mensagem que deseja verificar: ");
        String mensagem = scanner.nextLine();

        PalindromoDomain palindromoDomain = new PalindromoDomain(mensagem);
        if(verificarPalindromoUseCase.verificarPalindomo(mensagem)){
            System.out.println("\n SIM! A mensagem: " + palindromoDomain.getMensagem() + " é um palindromo!");
        } else {
            System.out.println("\n NÃO! A mensagem: " + palindromoDomain.getMensagem() + " não é um palindromo!");
        }
    }
}
