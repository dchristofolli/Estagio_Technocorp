package com.github.dchristofolli.technocorp.estagio.apresentacao02.newJavaFeatures.java8;

public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
