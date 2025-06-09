package com.exercicios.atividades.application.exercicio6.SomaDiagonaisUseCase;

import com.exercicios.atividades.domain.entity.MatrizDomain;

import java.util.HashMap;
import java.util.Map;

public class SomaDiagonaisUseCase {

    public Map<String,Integer> somaDiagonaisUseCase(MatrizDomain matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("MatrizDomain não pode ser nulo.");
        }

        Integer diagonalPrincipal = 0;

        Integer diagonalSecundaria = 0;

        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                Integer elementoAtual = matriz.getElemento(i, j);
                if(i == j){
                    diagonalPrincipal += elementoAtual;
                }
                if(i+j == matriz.getLinhas()-1){
                    diagonalSecundaria += elementoAtual;
                }
            }
        }

        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("primaria", diagonalPrincipal);
        resultado.put("secundaria", diagonalSecundaria);

        return resultado;
    }
}
