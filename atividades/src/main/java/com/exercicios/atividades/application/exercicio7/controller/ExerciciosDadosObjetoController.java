package com.exercicios.atividades.application.exercicio7.controller;

import com.exercicios.atividades.domain.entity.Numero;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.Scanner;

public class ExerciciosDadosObjetoController implements ControllerInterface {

    Scanner sc = new Scanner(System.in);

    @Override
    public void executar() {
        System.out.println("\n--- Exercício: Manipulando Dados de um Objeto ---");

        System.out.println("Criando uma instância da classe Numero...");
        Numero meuNumero = new Numero();

        System.out.println("Endereço de memória (hashCode) do objeto: " + System.identityHashCode(meuNumero));

        System.out.println("Qual valor deseja atribuir ?");
        int respota = sc.nextInt();
        meuNumero.setValor(respota);

        System.out.println("Chamando o método para imprimir o valor...");
        meuNumero.imprimirValor();
    }
}
