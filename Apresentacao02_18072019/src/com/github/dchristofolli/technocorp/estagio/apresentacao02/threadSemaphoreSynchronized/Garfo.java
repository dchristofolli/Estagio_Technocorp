package com.github.dchristofolli.technocorp.estagio.apresentacao02.threadSemaphoreSynchronized;

import java.util.concurrent.Semaphore;

public class Garfo extends Semaphore {
    public static final int GARFO_1 = 0;
    public static final int GARFO_2 = 1;
    public static final int GARFO_3 = 2;
    public static final int GARFO_4 = 3;
    public static final int GARFO_5 = 4;

    private String nome;

    public Garfo(String nome) {
//        super(1, true);
        super(1);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
