package br.com.stream.api.services;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFunction {
    List<Integer> numeros = Stream.generate(() -> (int) (Math.random() * 101)).limit(10).toList();

    Function<Integer, Double> multiplicar = numero -> numero * 2.2;

    public void imprimirNumerosD() {
        System.out.println("Números originais e multiplicados:");
        numeros.forEach(numero -> {
            Double numeroMultiplicado = multiplicar.apply(numero);
            System.out.printf("Original: %d -> Multiplicado: %.2f%n", numero, numeroMultiplicado);
        });
    }
}