package com.github.dchristofolli.technocorp.estagio.apresentacao01.estruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <10; i++) {
            fila.add(random.nextInt(100));
        }
        System.out.println("Elementos do queue: " + fila);
        System.out.println("Tamanho do queue: " + fila.size());
        System.out.println("O primeiro elemento do queue: " + fila.peek());
        System.out.println("Removendo o primeiro elemento da fila: " + fila.remove());
    }
}