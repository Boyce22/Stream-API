package br.com.stream.api.functionals;

import br.com.stream.api.services.StreamConsumer;
import br.com.stream.api.interfaces.InteractiveFunctional;

public class ConsumerFunctional implements InteractiveFunctional {

    @Override
    public void execute() {
        StreamConsumer consumer = new StreamConsumer();
        System.out.println("Números pares:");
        consumer.imprimirNumerosPares();
        System.out.println("\nNúmeros ímpares:");
        consumer.imprimirNumerosImpares();
    }

    @Override
    public String getDescription() {
        return "A interface Consumer consome objetos realizando operações específicas. Exemplo: Números pares e ímpares.";
    }
}