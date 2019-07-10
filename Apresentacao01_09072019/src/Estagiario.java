public class Estagiario extends Pessoa {
    public Estagiario(int id, String nome, double remuneracao, String cpf, String dataInicioContrato,
                      String dataFimContrato) {
        super(id, nome, remuneracao, cpf);
        this.dataInicioContrato = dataInicioContrato;
        this.dataFimContrato = dataFimContrato;
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
    private String dataInicioContrato;
    private String dataFimContrato;
}
