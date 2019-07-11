package com.github.dchristofolli.technocorp.estagio.apresentacao01;

public class Programador extends Pessoa implements Remuneracao {
    public Programador(int id, String nome, String nivel, double valorRemuneracao, String cpf, String dataAdmissao) {
        super(id, nome, valorRemuneracao, cpf);
        this.dataAdmissao = dataAdmissao;
        this.nivel = nivel;
    }
    private String dataAdmissao;
    private String nivel;
    private String tipoRemuneracao = defineTipoRemuneracao();

    @Override
    public String defineTipoRemuneracao() {
        return "Salário";
    }
    @Override
    public String toString() {
        return "Programador" +
                "\nNome: " + getNome() +
                "\nData de Admissão: " + dataAdmissao +
                "\nTipo de remuneração: " + tipoRemuneracao +
                "\nValor da remuneração: " +getValorRemuneracao()+
                "\nNível: " + nivel +
                "\nCPF: " + cpf;
    }

    public String getTipoRemuneracao() {
        return tipoRemuneracao;
    }

    public void setTipoRemuneracao(String tipoRemuneracao) {
        this.tipoRemuneracao = tipoRemuneracao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
