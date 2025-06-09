package com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioController;

import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.CadastrarFuncionarioUseCase;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.CalcularSalarioDepartamentoUseCase;
import com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase.ListarFuncionarioUseCase;
import com.exercicios.atividades.domain.entity.Funcionario;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.List;
import java.util.Scanner;

public class FuncionarioController implements ControllerInterface {

    private final Scanner scanner;
    private final ListarFuncionarioUseCase listarFuncionariosUseCase;
    private final CalcularSalarioDepartamentoUseCase calcularSalarioDepartamentoUseCase;
    private final CadastrarFuncionarioUseCase cadastrarFuncionarioUseCase;

    public FuncionarioController(Scanner scanner, ListarFuncionarioUseCase listarFuncionariosUseCase, CalcularSalarioDepartamentoUseCase calcularSalarioDepartamentoUseCase, CadastrarFuncionarioUseCase cadastrarFuncionarioUseCase) {
        this.scanner = scanner;
        this.listarFuncionariosUseCase = listarFuncionariosUseCase;
        this.calcularSalarioDepartamentoUseCase = calcularSalarioDepartamentoUseCase;
        this.cadastrarFuncionarioUseCase = cadastrarFuncionarioUseCase;
    }

    @Override
    public void executar() {
        int opcao = -1;
        do {
            System.out.println("\n--- Gerenciamento de Funcionários ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Todos os Funcionários");
            System.out.println("3. Calcular Total de Salários por Departamento");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: cadastrarFuncionario(); break;
                case 2: listarFuncionarios(); break;
                case 3: calcularSalarioPorDepartamento(); break;
            }
        } while (opcao != 0);
    }

    private void cadastrarFuncionario() {
        try {
            System.out.println("\n--- Cadastro de Novo Funcionário ---");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("ID do Departamento: ");
            String depto = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            cadastrarFuncionarioUseCase.executar(id, nome, salario, depto);
            System.out.println("Funcionário cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }

    private void listarFuncionarios() {
        List<Funcionario> todos = listarFuncionariosUseCase.executar();
        if (todos.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Funcionários ---");
        todos.forEach(System.out::println);
    }

    private void calcularSalarioPorDepartamento() {
        System.out.print("Digite o numero do departamento: ");
        String depto = scanner.nextLine();
        double total = calcularSalarioDepartamentoUseCase.executar(depto);
        System.out.printf("O total de salários para o departamento '%s' é: R$ %.2f%n", depto, total);
    }
}