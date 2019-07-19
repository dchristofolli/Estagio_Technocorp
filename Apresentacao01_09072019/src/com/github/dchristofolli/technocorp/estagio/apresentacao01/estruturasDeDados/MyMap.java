package com.github.dchristofolli.technocorp.estagio.apresentacao01.estruturasDeDados;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> roman = new HashMap<>();
        roman.put(1, "I");
        roman.put(5, "V");
        roman.put(10, "X");
        roman.put(50, "L");
        roman.put(100, "C");
        roman.put(500, "D");
        roman.put(1000, "M");
        System.out.println(roman);

        System.out.println("Tamanho do map: " + roman.size());
        System.out.println(roman.get(5));
        System.out.println("Contém a chave 5? " +roman.containsKey(5));
        System.out.println("Contém o valor L? " + roman.containsValue("L"));
        System.out.println(roman.entrySet());

    }
}
