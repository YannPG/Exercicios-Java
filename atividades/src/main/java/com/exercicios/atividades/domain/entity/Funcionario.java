package com.exercicios.atividades.domain.entity;

public class Funcionario {
    private final int id;
    private final String nome;
    private final double salario;
    private final String departamento;

    public Funcionario(int id, String nome, double salario, String departamento) {
        if (id <= 0 || nome == null || nome.trim().isEmpty() || salario < 0 || departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Dados do funcionário inválidos.");
        }
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getSalario() { return salario; }
    public String getDepartamento() { return departamento; }

    @Override
    public String toString() {
        return "Funcionario | ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("R$ %.2f", salario) + ", Depto: " + departamento;
    }
}