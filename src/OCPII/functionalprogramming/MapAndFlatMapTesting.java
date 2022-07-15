package OCPII.functionalprogramming;

import java.util.List;
import java.util.stream.Stream;

public class MapAndFlatMapTesting {
    public static void main(String[] args) {

        Stream<String> intsToStrings =
                Stream.of(1, 33, 57)
                        .map(Object::toString);
        String s = intsToStrings.findFirst().get();


        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        //it returns a Stream of the type that the function contains at a lower level
        Stream<String> topStream = animals.flatMap(m -> m.stream());


    }

}
