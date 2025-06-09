package com.exercicios.atividades.domain.repository;

import com.exercicios.atividades.domain.entity.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContatoRepository {
    private final List<Contato> contatos = new ArrayList<>();
    private static final int LIMITE_CONTATOS = 10;

    public void adicionar(Contato contato) {
        if (contatos.size() >= LIMITE_CONTATOS) {
            throw new IllegalStateException("A agenda está cheia. Não é possível adicionar mais de " + LIMITE_CONTATOS + " contatos.");
        }
        contatos.add(contato);
    }

    public List<Contato> getTodos() {
        return new ArrayList<>(contatos);
    }

    public Optional<Contato> buscarPorNome(String nome) {
        return contatos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    public int totalContatos() {
        return contatos.size();
    }
}