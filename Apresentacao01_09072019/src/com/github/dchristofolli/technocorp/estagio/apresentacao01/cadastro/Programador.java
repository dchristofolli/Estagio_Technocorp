package com.github.dchristofolli.technocorp.estagio.apresentacao01.cadastro;

public class Programador extends Pessoa implements Remuneracao {
    public Programador(int id, String nome, String nivel, double valorRemuneracao, String cpf) {
        super(id, nome, valorRemuneracao, cpf);
        this.nivel = nivel;
    }

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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
