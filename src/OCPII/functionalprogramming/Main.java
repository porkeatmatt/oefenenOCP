package OCPII.functionalprogramming;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) {
        FunctionalInterFace<Integer,Integer,String> f = (i1, i2) -> i1.toString() + i2.toString();
        String s = f.doSomething(1,5);

        Predicate<String> egg = s3 -> s3.contains("egg");
        Predicate<String> brown = s1 -> s1.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);

        System.out.println(brownEggs.test("brownegg"));

        Stream<String> sup = Stream.of("a","b","1");
        sup.min(Comparator.reverseOrder());

    }
}
