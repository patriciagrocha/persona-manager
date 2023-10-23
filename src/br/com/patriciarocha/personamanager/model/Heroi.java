package br.com.patriciarocha.personamanager.model;

public class Heroi extends Personagem{

    private String nomeVidaReal;

    public Heroi(String nome, String superpoder, String nomeVidaReal) {
        super(nome, superpoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return String.format("Heroi(%s - %s - %s)",
                getNome(), getSuperpoder(), getNomeVidaReal());
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
}
