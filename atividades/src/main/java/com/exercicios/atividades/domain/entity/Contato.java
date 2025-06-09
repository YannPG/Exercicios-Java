package com.exercicios.atividades.domain.entity;

public class Contato {
    private final String nome;
    private final String telefone;
    private final String email;

    public Contato(String nome, String telefone, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do contato não pode ser vazio.");
        }
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Contato | Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}