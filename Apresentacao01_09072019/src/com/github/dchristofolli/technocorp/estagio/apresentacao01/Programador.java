package com.github.dchristofolli.technocorp.estagio.apresentacao01;

public class Programador extends Pessoa {
    @Override
    public String toString() {
        return "com.github.dchristofolli.technocorp.estagio.apresentacao01.Programador:" +
                "\nNome: " + getNome() +
                "\nData de Admissão: " + dataAdmissao +
                "\nNível: " + nivel +
                "\nValor do Ticket Car: " + valeCombustivel.getValor() +
                "\nCPF: '" + cpf;
    }

    public Programador(int id, String nome, double remuneracao, String cpf, String dataAdmissao, String nivel,
                       ValeCombustivel valeCombustivel) {
        super(id, nome, remuneracao, cpf);
        this.dataAdmissao = dataAdmissao;
        this.nivel = nivel;
        this.valeCombustivel = valeCombustivel;
    }

    private String dataAdmissao;
    private String nivel;
    private ValeCombustivel valeCombustivel;

    public ValeCombustivel getValeCombustivel() {
        return valeCombustivel;
    }

    public void setValeCombustivel(ValeCombustivel valeCombustivel) {
        this.valeCombustivel = valeCombustivel;
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
