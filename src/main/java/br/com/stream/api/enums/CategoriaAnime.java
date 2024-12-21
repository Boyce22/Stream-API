package br.com.stream.api.enums;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public enum CategoriaAnime {

    ACAO("Ação"),
    AVENTURA("Aventura"),
    ROMANCE("Romance"),
    FANTASIA("Fantasia");

    private final String descricao;

    private static final List<String> descricoes = obterDescricoesDisponiveis();

    CategoriaAnime(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCategoria() {
        return descricao;
    }

    private static List<String> obterDescricoesDisponiveis() {
        return Arrays.stream(CategoriaAnime.values())
                .map(CategoriaAnime::getDescricaoCategoria)
                .toList();
    }

    public static String obterDescricaoAleatoria() {
        int indiceAleatorio = (int) (Math.random() * descricoes.size());
        return descricoes.get(indiceAleatorio);
    }
}