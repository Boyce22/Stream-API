package br.com.stream.api;

import br.com.stream.api.services.Interactive;

public class Main {

    public static void main(String[] args) {
        Interactive service = new Interactive();
        service.executar();
    }
}