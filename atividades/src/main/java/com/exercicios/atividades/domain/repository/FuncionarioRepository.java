package com.exercicios.atividades.domain.repository;

import com.exercicios.atividades.domain.entity.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioRepository {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionar(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Funcionario> getTodos() {
        return new ArrayList<>(this.funcionarios);
    }

    public List<Funcionario> buscarPorDepartamento(String departamento) {
        return this.funcionarios.stream()
                .filter(f -> f.getDepartamento().equalsIgnoreCase(departamento))
                .collect(Collectors.toList());
    }
}