package br.com.alura.screenmatch.service;

public interface IConverterDados {

    <T> T obterDados(String jason, Class<T> classe);
}
