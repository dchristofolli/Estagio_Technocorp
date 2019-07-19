package com.github.dchristofolli.technocorp.estagio.apresentacao02.threadSemaphoreSynchronized;

public class Main {

    public static void main(String[] args) {
        Garfo[] garfos = {
                new Garfo("Garfo 1"),
                new Garfo("Garfo 2"),
                new Garfo("Garfo 3"),
                new Garfo("Garfo 4"),
                new Garfo("Garfo 5")
        };

        Filosofo[] filosofos = {
                new Filosofo(Filosofo.NOME_F1, Garfo.GARFO_5, Garfo.GARFO_1),
                new Filosofo(Filosofo.NOME_F2, Garfo.GARFO_1, Garfo.GARFO_2),
                new Filosofo(Filosofo.NOME_F3, Garfo.GARFO_2, Garfo.GARFO_3),
                new Filosofo(Filosofo.NOME_F4, Garfo.GARFO_3, Garfo.GARFO_4),
                new Filosofo(Filosofo.NOME_F5, Garfo.GARFO_4, Garfo.GARFO_5),
        };

        Filosofo.garfos = garfos;

        filosofos[0].start();
        filosofos[1].start();
        filosofos[2].start();
        filosofos[3].start();
        filosofos[4].start();
    }
}