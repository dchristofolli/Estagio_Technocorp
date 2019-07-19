package com.github.dchristofolli.technocorp.estagio.apresentacao02.newJavaFeatures.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class List_Stream {
    public static void main(String[] args) {
        List<Pessoa> pessoa = Arrays.asList(new Pessoa("Daniel", 35),
                (new Pessoa("Daiane", 34)),
                (new Pessoa("Karina", 28)),
                (new Pessoa("Marcelo", 30)));
        Stream<Pessoa> streamPessoa = pessoa.stream();
//        streamPessoa.map(p -> p.getIdade()).reduce((x, y)-> x+y).ifPresent(p-> System.out.println(p));
//        System.out.println(streamPessoa.filter(p -> p.getNome().startsWith("D")).collect(Collectors.toList()));

        Optional<Integer> optionalPessoa = Optional.ofNullable(streamPessoa.mapToInt(p-> p.getIdade()).min().getAsInt());
        System.out.println(optionalPessoa);


    }
}