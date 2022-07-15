package OCPII.functionalprogramming;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExamples {
    public static void main(String[] args) {

        //treeset sorteert elementen alvorens ze toe te voegen
        Stream<String> s3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 =
                s3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println("gesorteerde set:" + set2);

        //set is niet geordened dus strings zitten random in set
        //er is eigenlijk geen garantie wat voor set wordt gereturned (hash of tree)
        Stream<String> s4 = Stream.of("w", "o", "l", "f");
        Set<String> set3 =
                s4.collect(Collectors.toSet());
        System.out.println("ongeordende set:" + set3);


    }
}
