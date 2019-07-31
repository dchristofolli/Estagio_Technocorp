package com.github.dchristofolli.technocorp.estagio.apresentacao02.newJavaFeatures.java11;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("=-".repeat(20));
        System.out.println("\n\t  hello   \u2005".strip());
        System.out.println("\n\t  hello   \u2005".trim()); // não detecta caracteres de espaço em branco unicode
        System.out.println("\n\t\u2005".isEmpty());
        System.out.println("\n\t\u2005".isBlank());
        System.out.println("Java \n \n11".lines()
                .filter(String::isBlank)
                .count());
    }
}
