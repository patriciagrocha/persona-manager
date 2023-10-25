package br.com.patriciarocha.personamanager;

import br.com.patriciarocha.personamanager.cli.Display;
import br.com.patriciarocha.personamanager.exception.OpcaoInvalidaException;
import br.com.patriciarocha.personamanager.model.Heroi;
import br.com.patriciarocha.personamanager.model.Opcao;
import br.com.patriciarocha.personamanager.model.Personagem;
import br.com.patriciarocha.personamanager.model.Vilao;
import br.com.patriciarocha.personamanager.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {

    private Display display = new Display();
    private PersonagemRepository personagemRepo = new PersonagemRepository();
    public void executar() {

        Opcao opcao = null;

        do{
            display.exibirMenu();
            int codigo = display.obterOpcao();

            try{
                opcao = Opcao.converter(codigo);
                processar(opcao);
            }catch(OpcaoInvalidaException e){
                display.exibirMensagem( e.getMessage());
            }

        }while (opcao != Opcao.SAIR);

    }

    private void processar(Opcao opcao) {
        if( opcao == Opcao.SAIR)
            return;
        if(opcao == Opcao.CADASTRAR_HEROI){
            Heroi heroi = display.obterDadosHeroi();
            personagemRepo.inserir(heroi);
        }else if(opcao == Opcao.CADASTAR_VILAO){
            Vilao vilao = display.obterDadosVilao();
            personagemRepo.inserir(vilao);
        }else if(opcao == Opcao.LISTAR){
            List<Personagem> personagens = personagemRepo.listar();
            display.listar(personagens);
        }

    }
}
