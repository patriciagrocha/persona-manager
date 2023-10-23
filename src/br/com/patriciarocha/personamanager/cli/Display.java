package br.com.patriciarocha.personamanager.cli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    public void exibirMenu(){

        System.out.println("** MENU **");
        System.out.println();
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println();

    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada:");
        Scanner scanner = new Scanner(System.in);

        try{
            int op = scanner.nextInt();
            return op;
        }catch(InputMismatchException e){
            return -1;
        }
    }

    public void exibirMensagem(String message) {

        System.out.println();
        System.out.println("========> " + message);
        System.out.println();
    }
}
