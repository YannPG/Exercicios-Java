package com.exercicios.atividades.application.exercicio5.MaiorMenorElementoMatrizUseCase;

import com.exercicios.atividades.domain.entity.MatrizDomain;
import java.util.HashMap;
import java.util.Map;

public class MaiorMenorElementoUseCase {

    public Map<String, Integer> encontrar(MatrizDomain matrizDomain) {
        if (matrizDomain == null) {
            throw new IllegalArgumentException("MatrizDomain não pode ser nulo.");
        }

        Integer maior = Integer.MIN_VALUE;
        Integer menor = Integer.MAX_VALUE;

        for (int i = 0; i < matrizDomain.getLinhas(); i++) {
            for (int j = 0; j < matrizDomain.getColunas(); j++) {
                Integer elementoAtual = matrizDomain.getElemento(i, j);

                if (elementoAtual > maior) {
                    maior = elementoAtual;
                }
                if (elementoAtual < menor) {
                    menor = elementoAtual;
                }
            }
        }

        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("maior", maior);
        resultado.put("menor", menor);

        return resultado;
    }
}