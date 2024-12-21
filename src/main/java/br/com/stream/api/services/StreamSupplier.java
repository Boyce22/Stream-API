package br.com.stream.api.services;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {

    Supplier<String> verdadeAbsoluta = () -> "Java é a melhor linguagem, exceto para o front-end";

    public void dizerVerdadesAbsolutas () {
        List<String> verdadesAbsolutas = Stream.generate(verdadeAbsoluta).limit(10).toList();

        verdadesAbsolutas.forEach(System.out::println);
    }
}
