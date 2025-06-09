package com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase;

import com.exercicios.atividades.domain.entity.Funcionario;
import com.exercicios.atividades.domain.repository.FuncionarioRepository;

public class CadastrarFuncionarioUseCase  {
    private final FuncionarioRepository funcionarioRepository;

    public CadastrarFuncionarioUseCase(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void executar(int id, String nome, double salario, String departamento) {
        Funcionario novoFuncionario = new Funcionario(id, nome, salario, departamento);
        funcionarioRepository.adicionar(novoFuncionario);
    }
}