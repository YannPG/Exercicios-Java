package com.exercicios.atividades.domain.entity;

public class MatrizDomain {

    private final Integer[][] matriz;
    private final int linhas;
    private final int colunas;

    public MatrizDomain(Integer[][] matrizOriginal) {
        if (matrizOriginal == null || matrizOriginal.length == 0 || matrizOriginal[0].length == 0) {
            throw new IllegalArgumentException("A matriz não pode ser nula ou vazia.");
        }

        this.linhas = matrizOriginal.length;
        this.colunas = matrizOriginal[0].length;
        this.matriz = new Integer[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            if (matrizOriginal[i].length != colunas) {
                throw new IllegalArgumentException("Todas as linhas da matriz devem ter o mesmo número de colunas.");
            }
            for (int j = 0; j < colunas; j++) {
                this.matriz[i][j] = matrizOriginal[i][j];
            }
        }
    }

    public int getLinhas() {
        return this.linhas;
    }

    public int getColunas() {
        return this.colunas;
    }

    public Integer getElemento(int linha, int coluna) {
        if (linha < 0 || linha >= this.linhas || coluna < 0 || coluna >= this.colunas) {
            throw new IndexOutOfBoundsException("Posição [" + linha + "][" + coluna + "] está fora dos limites da matriz.");
        }
        return this.matriz[linha][coluna];
    }
}