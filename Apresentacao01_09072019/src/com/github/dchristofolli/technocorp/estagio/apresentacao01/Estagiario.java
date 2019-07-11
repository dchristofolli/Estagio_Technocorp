package com.github.dchristofolli.technocorp.estagio.apresentacao01;


public class Estagiario extends Pessoa implements Remuneracao {

    public Estagiario(int id, String nome, double valorRemuneracao, String cpf,
                      String dataInicioContrato, String dataFimContrato) {
        super(id, nome, valorRemuneracao, cpf);
        this.dataInicioContrato = dataInicioContrato;
        this.dataFimContrato = dataFimContrato;
    }
    private String tipoRemuneracao = defineTipoRemuneracao();
    private String dataInicioContrato;
    private String dataFimContrato;

    public String defineTipoRemuneracao(){
        return "Bolsa Estágio";
    }
    @Override
    public String toString() {
        return "Estagiario: " +
                "\nNome: "+ getNome() +
                "\nTipo de Remuneracao: " + tipoRemuneracao+
                "\nValor da remuneração: " + getValorRemuneracao() +
                "\nData do início do Contrato: " + dataInicioContrato+
                "\nData do fim do contrato: " + dataFimContrato+
                "\nCPF: " + cpf;
    }

    public String tipo(String tipo) {
        return "Bolsa estágio";
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public String getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public String getTipoRemuneracao() {
        return tipoRemuneracao;
    }

    public void setTipoRemuneracao(String tipo) {
        this.tipoRemuneracao = tipo;
    }
}
