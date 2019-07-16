package com.github.dchristofolli.technocorp.estagio.apresentacao01.thread;

import java.util.concurrent.Semaphore;

public class processadorThread extends Thread {
    private int idThread;
    private Semaphore semaforo;

    public processadorThread(int idThread, Semaphore semaforo) {
        this.idThread = idThread;
        this.semaforo = semaforo;
    }
    private void processar(){
        try {
            System.out.println("Thread #" + idThread + " processando. ");
            Thread.sleep((long)(Math.random() * 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void entrarRegiaoNaoCritica(){
        System.out.println("Thread #" + idThread + " em região não crítica. ");
        processar();
    }
    private void entrarRegiaoCritica(){
        System.out.println("Thread #" + idThread + " entrando em região crítica. ");
        processar();
        System.out.println("Thread #" + idThread + " saindo da região crítica. ");
    }
    public void run(){
        entrarRegiaoNaoCritica();
        try {
            semaforo.acquire();
            entrarRegiaoCritica();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
