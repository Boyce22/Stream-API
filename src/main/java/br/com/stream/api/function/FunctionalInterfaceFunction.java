package br.com.stream.api.function;

/*
 * Representa uma interface funcional que aceita um argumento do tipo T e retorna um valor do tipo R.
 * Comumente usada para transformar ou mapear valores, realizando operações que produzem resultados.
 */

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionalInterfaceFunction {

    List<Integer> numeros = Stream.generate(() -> (int) (Math.random() * 101)).toList();

    Function<Integer, Double> multiplicar = numero -> (double) (numero * 2.2d);


    public void imprimirNumerosD () {
        List<Double> numerosMultiplicados = numeros.stream().map(multiplicar).toList();

        numerosMultiplicados.forEach(numero -> System.out.printf("%s ", numero));
    }

}
