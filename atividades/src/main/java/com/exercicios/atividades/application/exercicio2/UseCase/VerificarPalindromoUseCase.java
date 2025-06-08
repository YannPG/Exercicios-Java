package com.exercicios.atividades.application.exercicio2.UseCase;

public class VerificarPalindromoUseCase {
    public Boolean verificarPalindomo(String mensagem){
        String mensagemLimpa = mensagem.replaceAll("\\s+", "").toLowerCase();
        String palindromo = "";
        for(int i = mensagemLimpa.length() - 1; i >= 0; i--) {
            palindromo += mensagemLimpa.charAt(i);
        }
        return mensagemLimpa.equals(palindromo);
    }
}
