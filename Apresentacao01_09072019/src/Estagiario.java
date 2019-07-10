import java.util.Date;

public class Estagiario extends Pessoa {
    Date data_inicio_contrato;
    Date data_prev_fim_contrato;

    public Estagiario(int id, String nome, double remuneracao, String cpf) {
        super(id, nome, remuneracao, cpf);
    }
}
