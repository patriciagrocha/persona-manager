package br.com.patriciarocha.personamanager.model;

public class Vilao extends Personagem{
    private Integer tempoDePrisao;

    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        super(nome, superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return String.format("Vilao(%s - %s - %d)",
                getNome(), getSuperpoder(), getTempoDePrisao());
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}
