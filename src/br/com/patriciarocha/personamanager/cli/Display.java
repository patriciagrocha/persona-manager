package br.com.patriciarocha.personamanager.cli;

import br.com.patriciarocha.personamanager.model.Heroi;
import br.com.patriciarocha.personamanager.model.Personagem;
import br.com.patriciarocha.personamanager.model.Vilao;

import java.util.InputMismatchException;
import java.util.List;
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

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();

        System.out.println("Informe nome na vida real: ");
        String nomeVidaReal = scanner.nextLine();

        return new Heroi(nome, superpoder, nomeVidaReal);
    }

    public Vilao obterDadosVilao() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();

        System.out.println("Informe o tempo de prisao: ");
       int tempoPrisao = scanner.nextInt();

        return new Vilao(nome, superpoder, tempoPrisao);
    }

    public void listar(List<Personagem> personagens) {
        System.out.println("Listando... ");
        //personagens.forEach(p -> System.out.println(p));
        personagens.forEach(System.out::println);
        System.out.println();
    }
}
