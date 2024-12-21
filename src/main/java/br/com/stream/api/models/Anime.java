package br.com.stream.api.models;

import br.com.stream.api.enums.CategoriaAnime;
import br.com.stream.api.enums.NomeAnime;

import java.util.UUID;

public class Anime {

    String id;

    String nome;

    String categoria;

    public Anime(String nome, String categoria) {
        this.id = gerarIdentificadorUnico();
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public static Anime criar() {
        return new Anime(obterNomeAleatorio(), obterDescricaoAleatoria());
    }

    private static String gerarIdentificadorUnico() {
        return UUID.randomUUID().toString();
    }

    private static String obterDescricaoAleatoria() {
        return CategoriaAnime.obterDescricaoAleatoria();
    }

    private static String obterNomeAleatorio() {
        return NomeAnime.obterNomeAleatorio();
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Anime: %s, Categoria: %s", id, nome, categoria);
    }
}
