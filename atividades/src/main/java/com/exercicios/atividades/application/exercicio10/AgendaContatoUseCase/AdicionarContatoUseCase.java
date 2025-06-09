package com.exercicios.atividades.application.exercicio10.AgendaContatoUseCase;

import com.exercicios.atividades.domain.entity.Contato;
import com.exercicios.atividades.domain.repository.ContatoRepository;

public class AdicionarContatoUseCase {
    private final ContatoRepository contatoRepository;

    public AdicionarContatoUseCase(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public void executar(String nome, String telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);
        contatoRepository.adicionar(novoContato);
    }
}