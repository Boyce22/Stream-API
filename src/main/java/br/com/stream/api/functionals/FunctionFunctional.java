package br.com.stream.api.functionals;

import br.com.stream.api.interfaces.InteractiveFunctional;
import br.com.stream.api.services.StreamFunction;

public class FunctionFunctional implements InteractiveFunctional {

    @Override
    public void execute() {
        StreamFunction function = new StreamFunction();
        function.imprimirNumerosD();
    }

    @Override
    public String getDescription() {
        return "A interface Function é usada para transformar valores. Exemplo: Multiplicação de uma lista de números por 2.2.";
    }
}