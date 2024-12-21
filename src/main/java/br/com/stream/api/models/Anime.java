package br.com.stream.api.models;

public class Anime {

    String nome;

    String categoria;

    public Anime(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("Anime: %s, Categoria: %s", nome, categoria);
    }
}
