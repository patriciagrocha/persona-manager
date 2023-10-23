package br.com.patriciarocha.personamanager.model;

public class Heroi extends Personagem{

    private String nomeVidaReal;

    public Heroi(String nome, String superpoder, String nomeVidaReal) {
        super(nome, superpoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
}
