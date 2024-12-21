package br.com.stream.api.supplier;

/*
 * Representa uma operação que fornece um valor do tipo T, sem aceitar nenhum argumento.
 * Usado principalmente para gerar ou fornecer valores sob demanda.
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalInterfaceSupplier {

    Supplier<String> verdadeAbsoluta = () -> "Java é a melhor linguagem, exceto para o front-end";

    public void dizerVerdadesAbsolutas () {
        List<String> verdadesAbsolutas = Stream.generate(verdadeAbsoluta).limit(10).toList();

        verdadesAbsolutas.forEach(System.out::println);
    }
}
