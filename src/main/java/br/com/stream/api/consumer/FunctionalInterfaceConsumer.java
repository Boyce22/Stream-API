package br.com.stream.api.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * Representa uma operação que recebe um argumento do tipo T, mas não retorna nenhum valor.
 * Geralmente utilizada para realizar ações ou efeitos colaterais nos elementos do Stream,
 * sem modificar ou retornar valores.
 */

public class FunctionalInterfaceConsumer {

    Supplier<Integer> gerarNumero = () -> (int) (Math.random() * 101);

    List<Integer> numeros = Stream.generate(gerarNumero).limit(10).toList();

    public void imprimirNumerosPares () {
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.printf("%s ", numero);
            }
        }
    }

    public void imprimirNumerosImpares () {
        Consumer<Integer> verificarNumerosImpares = numero -> {
            if(numero % 2 != 0) {
                System.out.printf("%s ", numero);
            }
        };

        numeros.forEach(verificarNumerosImpares);
    }
}
