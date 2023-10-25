package br.com.patriciarocha.personamanager.model;

import br.com.patriciarocha.personamanager.exception.OpcaoInvalidaException;

public enum Opcao {

    CADASTRAR_HEROI,
    CADASTAR_VILAO,
    LISTAR,
    SAIR;

    public static Opcao converter(int codigo) throws OpcaoInvalidaException {

        if(codigo == 0 || codigo > 4)
            throw new OpcaoInvalidaException("Opção inválida!");
        if(codigo == 4)
            return SAIR;

        return Opcao.values()[codigo - 1];
    }
}
