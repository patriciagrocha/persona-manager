package br.com.patriciarocha.personamanager.model;

public enum Opcao {

    CADASTRAR_HEROI,
    CADASTAR_VILAO,
    LISTAR,
    SAIR;

    public static Opcao converter(int codigo){

        if(codigo == 0 || codigo > 4)
            throw new IllegalArgumentException("Opção inválida!");
        if(codigo == 4)
            return SAIR;

        return Opcao.values()[codigo - 1];
    }
}
