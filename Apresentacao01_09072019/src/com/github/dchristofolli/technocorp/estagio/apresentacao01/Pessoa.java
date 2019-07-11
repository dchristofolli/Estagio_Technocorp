package com.github.dchristofolli.technocorp.estagio.apresentacao01;

public class Pessoa implements Remuneracao {
    private int id;
    private String nome;
    private double valorRemuneracao;

    public Pessoa(int id, String nome, double valorRemuneracao, String cpf) {
        this.id = id;
        this.nome = nome;
        this.valorRemuneracao = valorRemuneracao;
        this.cpf = cpf;
    }

    public double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
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

    @Override
    public String defineTipoRemuneracao() {
        return null;
    }
}
