package com.exercicios.atividades.domain.entity;

import com.exercicios.atividades.domain.exceptions.NumeroNegativoException;
import com.exercicios.atividades.domain.exceptions.ValorInvalidoException;

public class FatorialDomain {

    Long numero;

    public FatorialDomain(Long numero) {
        if (numero == null) {
            throw new ValorInvalidoException("\nO valor não pode ser nulo.");
        }
        if(numero < 0){
            throw new NumeroNegativoException("\nO valor não pode ser menor");
        }
        this.numero = numero;
    }

    public Long getnumero(){
        return numero;
    }
}
