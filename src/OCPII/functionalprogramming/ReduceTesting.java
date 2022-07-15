package OCPII.functionalprogramming;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTesting {
    public static void main(String[] args) {
        //reduce heeft 3 overload, één met 1 parameter, één met 2, één met 3

        //de eerste returnt een optional en geef je alleen accumulator( = binaryOperator) aan mee
        //accumulator
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Optional<String> word = stream.reduce((s, c) -> s + c);
        System.out.println(word.get()); // wolf

        //hier geef je een identity (=beginwaarde) en
        // accumulator (= binaryOperator) aan mee
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        //hier geef je een identity,
        // een accumulator(= bifunction) en een
        // combiner aan mee handig voor parallell streams
        Stream<String> stream3 = Stream.of("w", "o", "l", "f!").parallel();
        int length = stream.reduce(0, (i, s) -> i+s.length(), (a, b) -> a+b);
        System.out.println(length); // 5
    }
}
