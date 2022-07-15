package OCPII.streaming;

import OCPI.casting.A;

import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {

    public static void threeDigit(Optional<Integer> optional){
        optional.map( n-> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        Stream<Integer> countingTill100 = Stream.iterate(
                1,
                i -> i < 101,
                i -> i + 1);


//        countingTill100.map( i -> {
//            if (i % 15 == 0) {
//                return "fizbuzz";
//            }else if(i % 5 == 0){
//                return "buzz";
//            }else if(i % 3 == 0) {
//                return "fizz";
//            }else{
//                return i.toString();
//            }
//        })
//                .forEach(System.out::println);

//        Animal a = new Animal(1, "blafke");
//        Animal b = new Animal(12, "wannes");
//        Animal c = new Animal(7, "elon");
//
//       Stream.of(a, b, c)
//       .sorted()
//       .forEach(System.out::println);

        IntStream ints = IntStream.range(1, 6);

        IntSummaryStatistics stats = ints.summaryStatistics();

        Optional<String> opt = Optional.of("lol");
        Optional<String> opt2 = opt.map(s -> s + "a");

        Animal a = new Animal(67, "alex");
        Animal b = new Animal(5, "aaron");
        Animal c = new Animal(999, "ztop");

        var animals = Stream.of(a, b, c);
        TreeSet<Animal> result = animals
                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(result);

        var ohMy = Stream.of("lions", "bears", "tigers");
        Map<Integer, String> map = ohMy.collect(
                Collectors.toMap(
                        String::length,
                        v -> v,
                        (s1,s2) -> "gemergde value"

                )
        );

        map.forEach((k,v) -> System.out.println("key: " + k + " value: " + v ) );

        var ohMy2 = Stream.of("lions", "bears", "tigers");

        Predicate<String> predicate = s -> s.length() > 3;

        var testStream = Stream.iterate("-", s -> ! s.isEmpty(), (s -> s +s));
        System.out.println(testStream.noneMatch(predicate));


    }
}
