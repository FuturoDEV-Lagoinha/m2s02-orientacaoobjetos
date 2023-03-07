package br.com.lagoinha.orientacaoobjeto;

import br.com.lagoinha.orientacaoobjeto.metodos.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario iu = new InterfaceUsuario();

        String nomeInformado = iu.perguntarNome();
        iu.imprimirNome(nomeInformado);

    }

}
