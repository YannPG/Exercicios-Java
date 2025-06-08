package com.exercicios.atividades.domain.exceptions;

public class NumeroNegativoException extends RuntimeException {
    public NumeroNegativoException(String message) {
        super(message);
    }
}
