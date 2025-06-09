package com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase;

import com.exercicios.atividades.domain.entity.Funcionario;
import com.exercicios.atividades.domain.repository.FuncionarioRepository;

import java.util.List;

public class ListarFuncionarioUseCase {
    private final FuncionarioRepository funcionarioRepository;


    public ListarFuncionarioUseCase(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> executar() {
        return funcionarioRepository.getTodos();
    }
}