package com.exercicios.atividades.application.exercicio2.UseCase;

public class VerificarPalindromoUseCase {
    public Boolean verificarPalindomo(String mensagem){
        String mensagemLimpa = mensagem.replaceAll("\\s+", "").toLowerCase();
        String palindromo = new StringBuilder(mensagemLimpa).reverse().toString();
        return mensagemLimpa.equals(palindromo);
    }
}
