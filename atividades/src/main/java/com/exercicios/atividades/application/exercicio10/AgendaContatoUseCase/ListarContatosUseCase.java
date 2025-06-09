package com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase;

import com.exercicios.atividades.domain.entity.Contato;
import com.exercicios.atividades.domain.repository.ContatoRepository;

import java.util.List;

public class ListarContatosUseCase {
    private final ContatoRepository contatoRepository;

    public ListarContatosUseCase(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contato> executar() {
        return contatoRepository.getTodos();
    }
}