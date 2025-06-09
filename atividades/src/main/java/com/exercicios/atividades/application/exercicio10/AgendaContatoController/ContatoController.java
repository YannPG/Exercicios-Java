package com.exercicios.atividades.application.exercicio10.AgendaContatoController;

import com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase.AdicionarContatoUseCase;
import com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase.ListarContatosUseCase;
import com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase.ProcurarContatoUseCase;
import com.exercicios.atividades.domain.entity.Contato;
import com.exercicios.atividades.infra.interfaces.ControllerInterface;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ContatoController implements ControllerInterface {

    private final Scanner scanner;
    private final AdicionarContatoUseCase adicionarContatoUseCase;
    private final ListarContatosUseCase listarContatosUseCase;
    private final ProcurarContatoUseCase procurarContatoUseCase;

    public ContatoController(Scanner scanner, AdicionarContatoUseCase adicionarContatoUseCase, ListarContatosUseCase listarContatosUseCase, ProcurarContatoUseCase procurarContatoUseCase) {
        this.scanner = scanner;
        this.adicionarContatoUseCase = adicionarContatoUseCase;
        this.listarContatosUseCase = listarContatosUseCase;
        this.procurarContatoUseCase = procurarContatoUseCase;
    }

    @Override
    public void executar() {
        int opcao = -1;
        do {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Todos os Contatos");
            System.out.println("3. Procurar Contato por Nome");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: adicionarContato(); break;
                case 2: listarContatos(); break;
                case 3: procurarContato(); break;
            }
        } while (opcao != 0);
    }

    private void adicionarContato() {
        try {
            System.out.println("\n--- Adicionar Novo Contato ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            adicionarContatoUseCase.executar(nome, telefone, email);
            System.out.println("Contato adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    private void listarContatos() {
        List<Contato> todos = listarContatosUseCase.executar();
        if (todos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
            return;
        }
        System.out.println("\n--- Lista de Contatos ---");
        todos.forEach(System.out::println);
    }

    private void procurarContato() {
        System.out.print("Digite o nome do contato a procurar: ");
        String nome = scanner.nextLine();
        Optional<Contato> contatoEncontrado = procurarContatoUseCase.executar(nome);

        if (contatoEncontrado.isPresent()) {
            Contato contato = contatoEncontrado.get();
            System.out.println("Contato encontrado:");
            System.out.println("  Telefone: " + contato.getTelefone());
            System.out.println("  Email: " + contato.getEmail());
        } else {
            System.out.println("Nenhum contato encontrado com o nome '" + nome + "'.");
        }
    }
}