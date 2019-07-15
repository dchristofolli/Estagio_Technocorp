package com.github.dchristofolli.technocorp.estagio.apresentacao01.estruturasDeDados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class MyStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Random random = new Random();
        for (int i =0; i<= 10; i++){
            stack.push(random.nextInt(100));
        }

        System.out.println("A pilha está vazia? " + stack.isEmpty());
        System.out.println("O elemento do topo da pilha é " + stack.peek());
        System.out.println("Retirando o elemento do topo da pilha. " + stack.pop());
        System.out.print("Acrescenta um elemento ao topo da pilha. ");
        stack.push(random.nextInt(100));
        System.out.println(stack.peek());
    }

}
