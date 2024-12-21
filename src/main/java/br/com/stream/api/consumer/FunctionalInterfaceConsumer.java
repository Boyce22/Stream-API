package br.com.stream.api.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Representa uma operação que recebe um argumento do tipo T, mas não retorna nenhum valor.
 * Geralmente utilizada para realizar ações ou efeitos colaterais nos elementos do Stream,
 * sem modificar ou retornar valores.
 */

public class FunctionalInterfaceConsumer {

    List<Integer> numeros = Arrays.asList(gerarNumero(), gerarNumero(), gerarNumero());

    public void imprimirNumerosPares () {
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero +  " ");
            }
        }
    }

    public void imprimirNumerosImpares () {
        Consumer<Integer> verificarNumerosImpares = numero -> {
            if(numero % 2 != 0) {
                System.out.print(numero +  " ");
            }
        };

        numeros.forEach(verificarNumerosImpares);
    }


    private Integer gerarNumero() {
        return (int) (Math.random() * 101);
    }
}
