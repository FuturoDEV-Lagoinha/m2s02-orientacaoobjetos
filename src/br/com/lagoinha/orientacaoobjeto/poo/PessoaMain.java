package br.com.lagoinha.orientacaoobjeto.poo;

import java.util.Date;

public class PessoaMain {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Gabriel", new Date());
//        pessoa1.setNome("Gabriel");
//        pessoa1.setNascimento(new Date());
        pessoa1.setAltura(1.75d);
        pessoa1.setGenero("Masculino");
        pessoa1.setRaca("Branca");
        pessoa1.setPeso(75d);

        System.out.println("Pessoa criada: " + pessoa1.getNome());
        pessoa1.comer();
        pessoa1.caminhar();
        pessoa1.descansar();
        pessoa1.dormir();

        Pessoa pessoa2 = new Pessoa("Maristela", new Date());
//        pessoa2.setNome("Maristela");
//        pessoa2.setNascimento(new Date());
        pessoa2.setAltura(1.73d);
        pessoa2.setGenero("Feminino");
        pessoa2.setRaca("Branca");
        pessoa2.setPeso(60d);

        System.out.println("Pessoa criada: " + pessoa2.getNome());
        pessoa2.comer();
        pessoa2.caminhar();
        pessoa2.descansar();
        pessoa2.dormir();

        pessoa1.conversar(pessoa2);


        System.out.println(pessoa1.getNome() + " peso anterior: " + pessoa1.getPeso());
        System.out.println(pessoa2.getNome() + " peso anterior: " + pessoa2.getPeso());
        pessoa2.correr(pessoa1);
        System.out.println(pessoa1.getNome() + " tem o peso de " + pessoa1.getPeso());
        System.out.println(pessoa2.getNome() + " tem o peso de " + pessoa2.getPeso());

        System.out.println("\n\n");

//        Pessoa pessoa3 = new Pessoa("Asaphe", new Date(), 1.73d, "Masculino", "Branco", 70d);
//
//        System.out.println("Pessoa criada: " + pessoa3.getNome());
//        pessoa3.comer();
//        pessoa3.caminhar();
//        pessoa3.descansar();
//        pessoa3.dormir();

        Pessoa pessoa4 = new Pessoa("Vini", new Date(), 1.7d, "Masculino", "Branco", 69d);
        pessoa4.comer();
        pessoa4.caminhar();
        pessoa4.descansar();
        pessoa4.dormir();


    }

}
