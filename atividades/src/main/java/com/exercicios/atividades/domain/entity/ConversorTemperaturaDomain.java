package com.exercicios.atividades.domain.entity;

import com.exercicios.atividades.domain.exceptions.ValorInvalidoException;

public class ConversorTemperaturaDomain {

    Double Temperatura;

    public ConversorTemperaturaDomain(Double temperatura) {
        if (temperatura == null) {
            throw new ValorInvalidoException("Valor não pode ser nulo.");
        }

        this.Temperatura = temperatura;
    }

    public Double getTemperatura (){
        return this.Temperatura;
    }
}
