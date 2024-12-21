package br.com.stream.api.binary;


import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * Representa uma operação que recebe dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É uma forma especializada de `BiFunction` em que os dois parâmetros e o retorno são do mesmo tipo.
 * Geralmente é usada para realizar operações binárias, como adição, subtração, ou combinações de valores em um único resultado.
 * O `BinaryOperator` é amplamente utilizado em operações de redução, como quando combinamos ou acumulamos elementos em streams.
 */

public class FunctionalInterfaceBinaryOperator {
    Supplier<Integer> gerarNumero = () -> (int) (Math.random() * 101);

    List<Integer> numeros = Stream.generate(gerarNumero).limit(10).toList();

    BinaryOperator<Integer> somar = Integer::sum;

    public void somarNumeros() {
        Integer resultado = numeros.stream().reduce(0, somar);

        System.out.printf("Numeros a serem somados: %s \n", numeros);

        System.out.println(resultado);
    }
}
