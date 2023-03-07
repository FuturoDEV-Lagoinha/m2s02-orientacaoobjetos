package br.com.lagoinha.orientacaoobjeto.metodos;

import java.util.Scanner;

public class InterfaceUsuario {

    public String perguntarNome() {
        System.out.print("Insira o seu nome: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public void imprimirNome(String nome) {
        System.out.println("Nome: " + nome);
    }

}
