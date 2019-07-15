package com.github.dchristofolli.technocorp.estagio.apresentacao01.estruturasDeDados;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        for(int i = 0; i <= 10; i++) {
            integerSet.add(i);
        }
        System.out.println("Elementos do set: "+ integerSet);
        System.out.println("Quantidade de elementos do set: " + integerSet.size());
        System.out.println("O set contém o número 3? " + integerSet.contains(3));
        System.out.println("Removendo o número 7 " + integerSet.remove(7));
        System.out.println("O set está vazio? " + integerSet.isEmpty());
        integerSet.clear();
        System.out.println("Limpando o set: " + integerSet);
        System.out.println("O set está vazio? " + integerSet.isEmpty());

    }

}
