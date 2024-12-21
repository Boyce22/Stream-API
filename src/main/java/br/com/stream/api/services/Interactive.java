package br.com.stream.api.services;

import br.com.stream.api.functionals.*;
import br.com.stream.api.interfaces.InteractiveFunctional;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interactive {
    private final Typing typingService;
    private final Map<Integer, InteractiveFunctional> FunctionalMap;

    private static final String MENU = """
            \n=== Escolha uma Functional Interface para aprender e executar ===
            1 - Predicate (Filtragem de Animes)
            2 - Consumer (Imprimir Números Pares e Ímpares)
            3 - Supplier (Gerador de Verdades Absolutas)
            4 - BinaryOperator (Somar Números)
            5 - Function (Multiplicação de Números)
            0 - Sair
            Digite sua opção: """;

    public Interactive() {
        this.typingService = new Typing();
        this.FunctionalMap = new HashMap<>();
        inicializarFunctionals();
    }

    private void inicializarFunctionals() {
        FunctionalMap.put(1, new PredicateFunctional());
        FunctionalMap.put(2, new ConsumerFunctional());
        FunctionalMap.put(3, new SupplierFunctional());
        FunctionalMap.put(4, new BinaryOperatorFunctional());
        FunctionalMap.put(5, new FunctionFunctional());
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            limparConsole();
            typingService.typeText(MENU);
            int opcao = scanner.nextInt();
            continuar = processarOpcao(opcao);
        }

        scanner.close();
    }

    private boolean processarOpcao(int opcao) {
        if (opcao == 0) {
            typingService.typeText("\nSaindo... Obrigado por usar o programa!\n");
            return false;
        }

        InteractiveFunctional FunctionalSelecionada = FunctionalMap.get(opcao);
        if (FunctionalSelecionada != null) {
            limparConsole();
            typingService.typeText("\n" + FunctionalSelecionada.getDescription() + "\n");
            FunctionalSelecionada.execute();
        } else {
            typingService.typeText("\nOpção inválida. Tente novamente.\n");
        }

        return true;
    }

    private void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("[Erro ao limpar o console]");
        }
    }
}