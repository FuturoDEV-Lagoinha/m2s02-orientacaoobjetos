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

    public void correr(Pessoa pessoa) {
        System.out.println(nome + " está correndo com " + pessoa.nome);
        peso = peso - 0.05d;
        pessoa.peso = pessoa.peso - 0.05d;
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

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
