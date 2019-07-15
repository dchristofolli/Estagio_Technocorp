package com.github.dchristofolli.technocorp.estagio.apresentacao01.cadastro;


public class Estagiario extends Pessoa implements Remuneracao {

    public Estagiario(int id, String nome, double valorRemuneracao, String cpf) {
        super(id, nome, valorRemuneracao, cpf);
    }
    private String tipoRemuneracao = defineTipoRemuneracao();

    @Override
    public String defineTipoRemuneracao(){
        return "Bolsa Estágio";
    }
    @Override
    public String toString() {
        return "Estagiario: " +
                "\nNome: "+ getNome() +
                "\nTipo de Remuneracao: " + tipoRemuneracao+
                "\nValor da remuneração: " + getValorRemuneracao() +
                "\nCPF: " + cpf;
    }

    public String tipo(String tipo) {
        return "Bolsa estágio";
    }

    public String getTipoRemuneracao() {
        return tipoRemuneracao;
    }

    public void setTipoRemuneracao(String tipo) {
        this.tipoRemuneracao = tipo;
    }
}
