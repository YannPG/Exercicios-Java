package com.exercicios.atividades.domain.exceptions;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String message) {
        super(message);
    }
}