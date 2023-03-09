package br.com.lagoinha.orientacaoobjeto.poo;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Date nascimento;
    private Double altura;
    private String genero;
    private String raca;
    private Double peso;

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, Date nascimento, Double altura, String genero, String raca, Double peso) {
        this(nome, nascimento);
        setAltura(altura);
        setGenero(genero);
        setRaca(raca);
        setPeso(peso);
    }

    public void comer() {
        System.out.println(nome + " está comendo...");
    }

    public void caminhar() {
        System.out.println(nome + " está caminhando...");
    }

    public void descansar() {
        System.out.println(nome + " está descansando...");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    public void conversar(Pessoa pessoa) {
        System.out.println(nome + " está conversando com " + pessoa.nome);
    }

    public void correr() {
        System.out.println(nome + " está correndo...");
        perderPeso();
    }

    public void correr(Pessoa pessoa) {
        System.out.println(nome + " está correndo com " + pessoa.nome);
        perderPeso();
        pessoa.perderPeso();
    }

    private void perderPeso() {
        peso = peso - 0.1d;
    }

// Getters e Setters
    public String getNome() {
        return nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public Pessoa setAltura(Double altura) {
        this.altura = altura;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Pessoa setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getRaca() {
        return raca;
    }

    public Pessoa setRaca(String raca) {
        this.raca = raca;
        return this;
    }

    public Double getPeso() {
        return peso;
    }

    public Pessoa setPeso(Double peso) {
        this.peso = peso;
        return this;
    }
}
