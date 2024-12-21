package br.com.stream.api.enums;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public enum NomeAnime {

    TRINITY_SEVEN("Trinity Seven"),
    IS_IT_WRONG_TO_TRY_TO_PICK_UP_GIRLS_IN_A_DUNGEON("Is It Wrong to Try to Pick Up Girls in a Dungeon?"),
    DATE_A_LIVE("Date A Live"),
    RAKUDAI_KISHI_NO_CAVALRY("Rakudai Kishi no Cavalry"),
    SWORD_ART_ONLINE("Sword Art Online"),
    DRAGON_BALL_Z("Dragon Ball Z"),
    SOUSEI_NO_ONMYOUJI("Sousei no Onmyouji");

    private final String nome;

    private static final List<String> nomesRestantes = new CopyOnWriteArrayList<>(obterNomesIniciais());

    NomeAnime(String nome) {
        this.nome = nome;
    }

    public String getNomeAnime() {
        return nome;
    }

    public static List<String> obterNomesIniciais() {
        return Arrays.stream(NomeAnime.values())
                .map(NomeAnime::getNomeAnime)
                .toList();
    }

    public static String obterNomeAleatorio() {
        final int indiceAleatorio = (int) (Math.random() * nomesRestantes.size());
        return nomesRestantes.remove(indiceAleatorio);
    }
}