package OCPII.functionalprogramming;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTesting {
    public static void main(String[] args) {
        //collect heeft 2 overloads
        //moet je zien als speciaal soort reduction

        //deze heeft een supplier een accumulator (biconsumer) en combiner (ook biconsumer)
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                //voegt een string toe aan stringbuilder
                StringBuilder::append,
                //merget 2 datacollecties (tussenresultaten) in 1
                StringBuilder::append);
        System.out.println(word); // wolf

        //deze overload doet hetzelfde als hierboven
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set =
                stream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]


        //dit kan ook maar nu is het niet zeker met wat voor set je aan het werken bent
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        Set<String> set2 =
                stream2.collect(Collectors.toSet());
        System.out.println(set); // [f, l, o, w]
    }

}
