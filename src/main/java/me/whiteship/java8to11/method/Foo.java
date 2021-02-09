package me.whiteship.java8to11.method;

import java.util.*;

public class Foo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bogeun");
        names.add("junsu");
        names.add("dami");
        names.add("foo");

//        names.forEach(System.out::println);

        //이터레이터와 기본적으로 같다.
        Spliterator<String> spliterators = names.spliterator();
        Spliterator<String> spliterators1 = spliterators.trySplit();
//        while (spliterators.tryAdvance(System.out::println));
//        System.out.println("============");
//        while (spliterators1.tryAdvance(System.out::println));

//        long k = names.stream().map(String::toUpperCase)
//                .filter(s -> s.startsWith("B"))
//                .count();
//
//        System.out.println(k);
//
//        names.removeIf(s -> s.startsWith("b"));
//        names.forEach(System.out::println);


        Comparator<String> comparator = String::compareToIgnoreCase;
        names.sort(comparator.reversed());
        names.forEach(System.out::println);
    }
}
