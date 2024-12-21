package br.com.stream.api;

import br.com.stream.api.consumer.FunctionalInterfaceConsumer;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceConsumer functionalInterfaceConsumer = new FunctionalInterfaceConsumer();

        functionalInterfaceConsumer.imprimirNumerosPares();
        
        functionalInterfaceConsumer.imprimirNumerosImpares();
    }
}