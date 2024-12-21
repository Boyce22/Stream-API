package br.com.stream.api.functionals;

import br.com.stream.api.interfaces.InteractiveFunctional;
import br.com.stream.api.services.StreamPredicate;

public class PredicateFunctional implements InteractiveFunctional {

    @Override
    public void execute() {
        StreamPredicate predicate = new StreamPredicate();
        predicate.imprimirAnimes();
    }

    @Override
    public String getDescription() {
        return "A interface Predicate avalia condições booleanas. Exemplo: Filtragem de animes pelo gênero Fantasia.";
    }
}