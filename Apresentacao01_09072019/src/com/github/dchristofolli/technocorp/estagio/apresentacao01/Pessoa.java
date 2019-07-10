package com.github.dchristofolli.technocorp.estagio.apresentacao01;

public class Pessoa {
    private int id;
    private String nome;
    private double remuneracao;

    public Pessoa(int id, String nome, double remuneracao, String cpf) {
        this.id = id;
        this.nome = nome;
        this.remuneracao = remuneracao;
        this.cpf = cpf;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String cpf;
}
