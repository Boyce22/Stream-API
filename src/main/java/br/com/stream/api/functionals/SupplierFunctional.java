package br.com.stream.api.functionals;

import br.com.stream.api.interfaces.InteractiveFunctional;
import br.com.stream.api.services.StreamSupplier;

public class SupplierFunctional implements InteractiveFunctional {

    @Override
    public void execute() {
        StreamSupplier supplier = new StreamSupplier();
        supplier.dizerVerdadesAbsolutas();
    }

    @Override
    public String getDescription() {
        return "A interface Supplier é usada para fornecer valores sem receber argumentos. Exemplo: Geração de uma lista de verdades absolutas.";
    }
}