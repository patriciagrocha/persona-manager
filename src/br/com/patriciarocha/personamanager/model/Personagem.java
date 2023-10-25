package br.com.patriciarocha.personamanager.model;

import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem> {

    private String nome;
    private String superpoder;

    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem other = (Personagem) o;
        return this.getNome().equals(other.getNome());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Personagem personagem) {
        return this.getNome().compareTo(personagem.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}
