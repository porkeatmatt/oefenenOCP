package OCPII.functionalprogramming;

import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamingApp {

    static List<Character> stringToChar (String s){
        List<Character> tempList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            tempList.add(s.charAt(i));
        }
        return tempList;
    }

    public static void main(String[] args) {
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 1);

        Stream<String> stream1 = Stream.of("monkey", "ape", "gorilla");

        Stream<Character> stream2 = stringToChar("beowulf and fluppe").stream();
//        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = Stream.of(3, 5, 6, 7);
        System.out.println(stream3.reduce((a,b)-> a*b));

        Stream<String> stream4 = Stream.of("w", "u", "l", "f");

        TreeSet<String> set = stream4.collect(
                () -> new TreeSet<>(),
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println("printing set: " + set);



    }

}
