package br.com.stream.api.functionals;

import br.com.stream.api.interfaces.InteractiveFunctional;
import br.com.stream.api.services.StreamBinaryOperator;

public class BinaryOperatorFunctional implements InteractiveFunctional {

    @Override
    public void execute() {
        StreamBinaryOperator binaryOperator = new StreamBinaryOperator();
        binaryOperator.somarNumeros();
    }

    @Override
    public String getDescription() {
        return "A interface BinaryOperator é usada para realizar operações com dois argumentos do mesmo tipo. Exemplo: Soma de uma lista de números.";
    }
}