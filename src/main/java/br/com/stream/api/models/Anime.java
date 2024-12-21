package br.com.stream.api.models;

import java.util.List;

public class Anime {

    Long id;

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

    private Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private Long gerarIdentificadorUnico() {
        return System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Anime: %s, Categoria: %s", id, nome, categoria);
    }
}
