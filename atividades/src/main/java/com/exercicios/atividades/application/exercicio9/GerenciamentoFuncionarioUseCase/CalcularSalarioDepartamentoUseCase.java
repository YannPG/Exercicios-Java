package com.exercicios.atividades.application.exercicio9.GerenciamentoFuncionarioUseCase;

import com.exercicios.atividades.domain.entity.Funcionario;
import com.exercicios.atividades.domain.repository.FuncionarioRepository;

import java.util.List;

public class CalcularSalarioDepartamentoUseCase {
    private final FuncionarioRepository funcionarioRepository;

    public CalcularSalarioDepartamentoUseCase(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public double executar(String departamento) {
        List<Funcionario> funcionariosDoDepto = funcionarioRepository.buscarPorDepartamento(departamento);
        return funcionariosDoDepto.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();
    }
}