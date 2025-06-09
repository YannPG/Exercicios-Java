package com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase;

import com.exercicios.atividades.domain.entity.Contato;
import com.exercicios.atividades.domain.repository.ContatoRepository;

import java.util.Optional;

public class ProcurarContatoUseCase {
    private final ContatoRepository contatoRepository;

    public ProcurarContatoUseCase(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public Optional<Contato> executar(String nome) {
        return contatoRepository.buscarPorNome(nome);
    }
}
