package com.exercicios.atividades.domain.exceptions;

public class DividirException extends RuntimeException {

    private final Double numerador;
    private final Double denominador;

    public DividirException(String message, Double numerador, Double denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Double getNumerador() {
        return numerador;
    }

    public Double getDenominador() {
        return denominador;
    }
}