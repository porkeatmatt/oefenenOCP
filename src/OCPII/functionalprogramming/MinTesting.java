package OCPII.functionalprogramming;

import java.util.Optional;
import java.util.stream.Stream;

public class MinTesting {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); // ape

        Stream<String> s2 = Stream.of("monkey", "ape", "bonobo");
        //DNC want moet je dus comparator aan meegeven
        //Optional<String> min2 = s.min();

    }
}
