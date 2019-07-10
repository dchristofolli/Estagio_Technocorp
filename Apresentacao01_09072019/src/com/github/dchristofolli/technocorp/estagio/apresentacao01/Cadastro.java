package com.github.dchristofolli.technocorp.estagio.apresentacao01;

public class Cadastro {
    public static void main(String[] args) {
        Programador programador = new Programador(1, "Daniel", 6000, "05553232694",
                "08/07/2019", "Senior", new ValeCombustivel());
        Estagiario estagiario = new Estagiario(1, "Carlos", 1000, "05553232098",
                "30/03/2019", "28/09/2019");
        System.out.println(programador.toString());
    }
}
