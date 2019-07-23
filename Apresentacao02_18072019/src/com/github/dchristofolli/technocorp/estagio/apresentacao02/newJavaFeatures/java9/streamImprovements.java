package com.github.dchristofolli.technocorp.estagio.apresentacao02.newJavaFeatures.java9;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamImprovements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "", "d", "e", "f");
        Stream<String> listStream = list.stream();

//        listStream.takeWhile(s->!s.isEmpty()).
//                forEach(System.out::print);
//        System.out.println();

//        listStream.dropWhile(s->!s.isEmpty()).
//                forEach(System.out::println);
//        System.out.println();
//
//        IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);
//        System.out.println(listStream.skip(2).collect(Collectors.joining(" - ")));

        listStream.forEach(s -> System.out.println(s));
//        Stream.ofNullable(listStream).forEach(s -> System.out.println(s.collect(Collectors.joining(" - "))));
    }
}
