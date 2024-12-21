package br.com.stream.api.services;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamBinaryOperator {
    Supplier<Integer> gerarNumero = () -> (int) (Math.random() * 101);

    List<Integer> numeros = Stream.generate(gerarNumero).limit(10).toList();

    BinaryOperator<Integer> somar = Integer::sum;

    public void somarNumeros() {
        Integer resultado = numeros.stream().reduce(0, somar);

        System.out.printf("Numeros a serem somados: %s \n", numeros);

        System.out.println(resultado);
    }
}
