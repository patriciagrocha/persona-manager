package br.com.patriciarocha.personamanager;

import br.com.patriciarocha.personamanager.cli.Display;
import br.com.patriciarocha.personamanager.model.Opcao;

public class Aplicacao {

    private Display display = new Display();
    public void executar() {

        Opcao opcao = null;

        do{
            display.exibirMenu();
            int codigo = display.obterOpcao();

            try{
                opcao = Opcao.converter(codigo);
                processar(opcao);
            }catch(IllegalArgumentException e){
                display.exibirMensagem( e.getMessage());
            }

        }while (opcao != Opcao.SAIR);

    }

    private void processar(Opcao opcao) {

    }
}
